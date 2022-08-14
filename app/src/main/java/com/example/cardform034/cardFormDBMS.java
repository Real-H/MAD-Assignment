package com.example.cardform034;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class cardFormDBMS extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "FormData";

    public cardFormDBMS(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

//    public nocFormDBMS() {
//
//    }
    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table FormDetails (Name TEXT PRIMARY KEY, " +
                "SoORdo TEXT, RegistrationNo TEXT, RollNo TEXT, Department TEXT, " +
                "Program TEXT, DegreeStatus TEXT, CGPA TEXT, InstituteWhereStudied TEXT, " +
                "InstituteMigratedTo TEXT, NocDepositedFee TEXT,ChallanNo TEXT,DepositDate TEXT," +
                "Address TEXT,MobileNo TEXT, LandlineOrPTCl TEXT, MobileOfGuardian TEXT, ModeOfReceive TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop TABLE if exists FormDetails");
    }

    public boolean insertUserData(String name, String soORdo, String registrationNo, String rollNo,
                                  String department, String program, String degreeStatus, String cGPA,
                                  String instituteWhereStudied, String instituteMigratedTo, String nocDepositedFee, String challanNo,
                                  String depositDate,String address,String mobileNo,String landlineOrPTCl,String mobileOfGuardian, String  modeOfReceive){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Name", name);
        contentValues.put("SoORdo", soORdo);
        contentValues.put("RegistrationNo", registrationNo);
        contentValues.put("RollNo", rollNo);
        contentValues.put("Department", department);
        contentValues.put("Program", program);
        contentValues.put("DegreeStatus", degreeStatus);
        contentValues.put("CGPA", cGPA);
        contentValues.put("InstituteWhereStudied", instituteWhereStudied);
        contentValues.put("InstituteMigratedTo", instituteMigratedTo);
        contentValues.put("NocDepositedFee", nocDepositedFee);
        contentValues.put("ChallanNo", challanNo);
        contentValues.put("DepositDate", depositDate);
        contentValues.put("Address", address);
        contentValues.put("MobileNo", mobileNo);
        contentValues.put("LandlineOrPTCl", landlineOrPTCl);
        contentValues.put("MobileOfGuardian", mobileOfGuardian);
        contentValues.put("ModeOfReceive", modeOfReceive);
        MyDB.insert("FormDetails", null, contentValues);
        long result = MyDB.insert("FormDetails", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean updateUserData(String Name, String SoORdo, String RegistrationNo, String RollNo,
                                  String Department, String Program, String DegreeStatus, String CGPA,
                                  String InstituteWhereStudied, String InstituteMigratedTo, String NocDepositedFee, String ChallanNo,
                                  String DepositDate,String Address,String MobileNo,String LandlineOrPTCl,String MobileOfGuardian, String  ModeOfReceive){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Name", Name);
        contentValues.put("SoORdo", SoORdo);
        contentValues.put("RegistrationNo", RegistrationNo);
        contentValues.put("RollNo", RollNo);
        contentValues.put("Department", Department);
        contentValues.put("Program", Program);
        contentValues.put("DegreeStatus", DegreeStatus);
        contentValues.put("CGPA", CGPA);
        contentValues.put("InstituteWhereStudied", InstituteWhereStudied);
        contentValues.put("InstituteMigratedTo", InstituteMigratedTo);
        contentValues.put("NocDepositedFee", NocDepositedFee);
        contentValues.put("ChallanNo", ChallanNo);
        contentValues.put("DepositDate", DepositDate);
        contentValues.put("Address", Address);
        contentValues.put("MobileNo", MobileNo);
        contentValues.put("LandlineOrPTCl", LandlineOrPTCl);
        contentValues.put("MobileOfGuardian", MobileOfGuardian);
        contentValues.put("ModeOfReceive", ModeOfReceive);
        Cursor cursor = MyDB.rawQuery("Select * from FormDetails where RollNo = ?", new String[] {RollNo});

        if (cursor.getCount() > 0) {
            long result = MyDB.update("FormDetails", contentValues, "RollNo=?", new String[]{RollNo});
            if (result == -1)
                return false;
            else
                return true;
        }else {
            return false;
        }
    }

    public boolean deleteUserData(String rollNotodel){
        SQLiteDatabase MyDB = this.getWritableDatabase();

        Cursor cursor = MyDB.rawQuery("Select * from FormDetails where RollNo = ?", new String[] {rollNotodel});

        if (cursor.getCount() > 0) {
            Log.d("data-1", "onCreate: " +"enter del sql method");
            long result = MyDB.delete("FormDetails", "RollNo=?", new String[] {rollNotodel});
            Log.d("data-1", "onCreate: " +"executed del sql method");
            if (result == -1)
                return false;
            else
                return true;
        }else {
            return false;
        }
    }


    public Cursor viewUserData(){
        SQLiteDatabase MyDB = this.getWritableDatabase();

        Cursor cursor = MyDB.rawQuery("Select * from FormDetails", null);
        return cursor;
    }
    public List<cardModel> ToObject(Cursor cursor){
        List<cardModel> mylist = new ArrayList<>();
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
        return mylist;
    }
}
