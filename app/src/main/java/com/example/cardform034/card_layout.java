package com.example.cardform034;

import androidx.appcompat.app.AppCompatActivity;

public class card_layout extends AppCompatActivity {

    /*List<nocModel> mylist ;
    nocFromAdapter myadapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noc_layout);

        recyclerView = findViewById(R.id.rvListItems);
        mylist = new ArrayList<>();
        mylist.add(new nocModel(1,"Qaseem","1","1","1","1",
                "1","1","1","1","1","1",
                "1","1","1","1","1","1","1"));
        nocModel mymodel = new nocModel("Qaseem","1","1");
        mylist.add(mymodel);
        Log.i("student", "\nForm Data\n" + mymodel.toString());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myadapter = new nocFromAdapter();
        myadapter.setNocModels(mylist);
        recyclerView.setAdapter(myadapter);
        findViewById(R.id.btnadd).setOnClickListener(v ->{
            Intent intent = new Intent(noc_layout.this,nocDetail.class);
            startActivityForResult(intent,345);

        });


        findViewById(R.id.btnDel).setOnClickListener(v ->{

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 345 && resultCode == RESULT_OK)
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
                mylist.add(new nocModel(mylist.size()+1, Name, SoORdo, RegistrationNo,RollNo,
                        Department,Program,DegreeStatus,CGPA,InstituteWhereStudied,InstituteMigratedTo,
                        NocDepositedFee,ChallanNo,DepositDate,Address,MobileNo,LandlineOrPTCl,MobileOfGuardian,
                        ModeOfReceive));

                myadapter.notifyDataSetChanged();
            }
        }

    }*/
}