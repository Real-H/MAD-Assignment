package com.example.cardform034;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormActivity extends AppCompatActivity {

    List<cardModel> mylist ;
    cardFromAdapter myadapter;
    RecyclerView recyclerView;
    cardFormDBMS db;
    public void calldelondetail(String roll){
        db.deleteUserData(roll);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        recyclerView = findViewById(R.id.rvListItems);
        mylist = new ArrayList<>();
        db = new cardFormDBMS(this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Cursor cursor = new cardFormDBMS(this).viewUserData();
        myadapter = new cardFromAdapter();

        //mylist = nocFormDB.readFromFile(getApplicationContext());
        //mylist = db.ToObject(cursor);

        while (cursor.moveToNext()){
            cardModel obj = new cardModel(cursor.getString(0),
                    cursor.getString(1), cursor.getString(2),
                    cursor.getString(3), cursor.getString(4),
                    cursor.getString(5), cursor.getString(6),
                    cursor.getString(7), cursor.getString(8),
                    cursor.getString(9), cursor.getString(10),
                    cursor.getString(11),cursor.getString(12),cursor.getString(13),
                    cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17));
            mylist.add(obj);

        }
        myadapter.setNocModels(mylist);
        Log.d("data-1", "onCreate: " + "oo");
        recyclerView.setAdapter(myadapter);

        findViewById(R.id.btnadd).setOnClickListener(v ->{
            Intent intent = new Intent(FormActivity.this, cardDetail.class);
            startActivityForResult(intent,345);

        });

        findViewById(R.id.btnLogOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(FormActivity.this, LoginActivity.class);
                startActivity(logout);
            }
        });





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 345 )
        {
            if(resultCode != RESULT_CANCELED) {

                String Name = data.getStringExtra("Name");
                String SoORdo = data.getStringExtra("SoORdo");
                String RegistrationNo = data.getStringExtra("RegistrationNo");
                String RollNo = data.getStringExtra("RollNo");
                String Department = data.getStringExtra("Department");
                String Program = data.getStringExtra("Program");
                String DegreeStatus = data.getStringExtra("DegreeStatus");
                String CGPA = data.getStringExtra("CGPA");
                String InstituteWhereStudied = data.getStringExtra("InstituteWhereStudied");
                String InstituteMigratedTo = data.getStringExtra("InstituteMigratedTo");
                String NocDepositedFee = data.getStringExtra("NocDepositedFee");
                String ChallanNo = data.getStringExtra("ChallanNo");
                String DepositDate = data.getStringExtra("DepositDate");
                String Address = data.getStringExtra("Address");
                String MobileNo = data.getStringExtra("MobileNo");
                String LandlineOrPTCl = data.getStringExtra("LandlineOrPTCl");
                String MobileOfGuardian = data.getStringExtra("MobileOfGuardian");
                String ModeOfReceive = data.getStringExtra("ModeOfReceive");



                Boolean checkInsertData = db.insertUserData(Name, SoORdo, RegistrationNo,RollNo,
                        Department,Program,DegreeStatus,CGPA,InstituteWhereStudied,InstituteMigratedTo,
                        NocDepositedFee,ChallanNo,DepositDate,Address,MobileNo,LandlineOrPTCl,MobileOfGuardian,
                        ModeOfReceive);
                Log.d("data-1", "onCreate: " +checkInsertData);

                if (checkInsertData == true){
                    Toast.makeText(FormActivity.this, "Data Inserted Successfully!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(FormActivity.this, "Data Not Inserted!", Toast.LENGTH_SHORT).show();
                }
                mylist.add(new cardModel(Name, SoORdo, RegistrationNo,RollNo,
                        Department,Program,DegreeStatus,CGPA,InstituteWhereStudied,InstituteMigratedTo,
                        NocDepositedFee,ChallanNo,DepositDate,Address,MobileNo,LandlineOrPTCl,MobileOfGuardian,
                        ModeOfReceive));
                myadapter.notifyDataSetChanged();
            }
        }


    }

}