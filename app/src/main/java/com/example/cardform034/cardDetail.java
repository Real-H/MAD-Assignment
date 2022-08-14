package com.example.cardform034;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class cardDetail extends AppCompatActivity {

    cardFormDBMS db;
    List<cardModel> mylist = new ArrayList<>();
    EditText name;
    EditText sodo;
    EditText RegistrationNo;
    EditText RollNo;
    EditText Department;
    EditText Program;
    EditText DegreeStatus;
    EditText CGPA;
    EditText InstituteWhereStudied;
    EditText InstituteMigratedTo;
    EditText NocDepositedFee;
    EditText ChallanNo;
    EditText DepositDate;
    EditText Address;
    EditText MobileNo;
    EditText LandlineOrPTCl;
    EditText MobileOfGuardian;
    EditText ModeOfReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_detail);

        name = findViewById(R.id.edittxtName);
        sodo = findViewById(R.id.edittxtsodo);
        RegistrationNo  = findViewById(R.id.edittxtregno);
        RollNo = findViewById(R.id.edittxtrollnu);
        Department = findViewById(R.id.edittxtdept);
        Program = findViewById(R.id.edittxtprogram);
        DegreeStatus = findViewById(R.id.edittxtdegreestatus);
        CGPA = findViewById(R.id.edittxtcgpa);
        InstituteWhereStudied = findViewById(R.id.edittxtwherestudied);
        InstituteMigratedTo = findViewById(R.id.edittxtwherewant);
        NocDepositedFee = findViewById(R.id.edittxtnocdeposited);
        ChallanNo = findViewById(R.id.edittxtchallannu);
        DepositDate = findViewById(R.id.Datepicker);
        Address = findViewById(R.id.edittxtaddress);
        MobileNo = findViewById(R.id.edittxtmobnum);
        LandlineOrPTCl = findViewById(R.id.edittxtptcl);
        MobileOfGuardian = findViewById(R.id.edittxtmobnumguard);
        ModeOfReceive = findViewById(R.id.edittxtmode);


        findViewById(R.id.btnDone).setOnClickListener(v ->{

             String Name = name.getText().toString();
             String SoORdo = sodo.getText().toString();
             String Registrationnu = RegistrationNo.getText().toString();
             String Rollno = RollNo.getText().toString();
             String department = Department.getText().toString();
             String program = Program.getText().toString();
             String Degreestatus = DegreeStatus.getText().toString();
             String cGPA = CGPA.getText().toString();
             String InstituteWherestudied = InstituteWhereStudied.getText().toString();
             String InstituteMigratedto = InstituteMigratedTo.getText().toString();
             String NocDepositedfee = NocDepositedFee.getText().toString();
             String Challanno = ChallanNo.getText().toString();
             String Depositdate = DepositDate.getText().toString();
             String address = Address.getText().toString();
             String Mobileno = MobileNo.getText().toString();
             String LandlineorPTCl = LandlineOrPTCl.getText().toString();
             String MobileOfguardian = MobileOfGuardian.getText().toString();
             String ModeOfreceive = ModeOfReceive.getText().toString();



             Intent intent = new Intent();

             intent.putExtra("Name",Name);
             intent.putExtra("SoORdo",SoORdo);
             intent.putExtra("RegistrationNo",Registrationnu);
             intent.putExtra("RollNo",Rollno);
             intent.putExtra("Department",department);
             intent.putExtra("Program",program);
             intent.putExtra("DegreeStatus",Degreestatus);
             intent.putExtra("CGPA",cGPA);
             intent.putExtra("InstituteWhereStudied",InstituteWherestudied);
             intent.putExtra("InstituteMigratedTo",InstituteMigratedto);
             intent.putExtra("NocDepositedFee",NocDepositedfee);
             intent.putExtra("ChallanNo",Challanno);
             intent.putExtra("DepositDate",Depositdate);
             intent.putExtra("Address",address);
             intent.putExtra("MobileNo",Mobileno);
             intent.putExtra("LandlineOrPTCl",LandlineorPTCl);
             intent.putExtra("MobileOfGuardian",MobileOfguardian);
             intent.putExtra("ModeOfReceive",ModeOfreceive);
            //startActivity(intent);
            cardDetail.this.setResult(RESULT_OK, intent);
            cardDetail.this.finish();
        });

    }
}