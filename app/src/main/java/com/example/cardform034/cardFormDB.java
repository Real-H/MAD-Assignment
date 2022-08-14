package com.example.cardform034;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class cardFormDB {
    private static final String FILE_NAME = "NOCForms.txt";

    public static void writeToFile(Context context, cardModel model) {
        File path = context.getFilesDir();
        try {
//            new FileWriter(new File(context.getFilesDir(), "rsapplications.csv"), false).close();
            BufferedWriter bo = new BufferedWriter(new FileWriter(new File(path, FILE_NAME), true));
            bo.write(model.toString());
            Log.d("data-1", "onCreate: " + model.toString());
            bo.newLine();
            bo.flush();
            bo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<cardModel> readFromFile(Context context) {
        //Log.d("data-1", "onCreate: " + "called readfromfile");
        List<cardModel> nocModelsss = new ArrayList<>();
        File path = context.getFilesDir();
        File readFrom = new File(path, FILE_NAME);
        try {
            BufferedReader br = new BufferedReader(new FileReader(readFrom));
            String line = "";
            while ((line = br.readLine()) != null) {
                cardModel nocMymodel = nocLinetoModel(line);
                nocModelsss.add(nocMymodel);
               // Log.d("data-1", "onCreate: " + "called readfromfile");
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nocModelsss;
    }
    public static cardModel nocLinetoModel(String data){
        String[] values = data.split(",");
        int nocID =Integer.parseInt(values[0].trim());
        String nocName = values[1].trim();
        String nocsoORro = values[2].trim();
        String nocReg  = values[3].trim();
        String nocRoll  = values[4].trim();
        String nocDept  = values[5].trim();
        String nocProgram = values[6].trim();
        String nocDegreestatus  = values[7].trim();
        String nocCGPA = values[8].trim();
        String nocInstitueWhereStuded  = values[9].trim();
        String nocInstiCame = values[10].trim();
        String nocDepositedFee  = values[11].trim();
        String nocChallan = values[12].trim();
        String nocDepositedate =  values[13].trim();
        String nocAddress = values[14].trim();
        String nocMobileNO =  values[15].trim();
        String nocLandline =  values[16].trim();
        String nocMobOfGurdain = values[17].trim();
        String nocModeofrecieve = values[18].trim();
        cardModel mymodel = new cardModel(nocID,nocName,nocsoORro,nocReg,nocRoll,nocDept,
                nocProgram,nocDegreestatus,nocCGPA,nocInstitueWhereStuded,nocInstiCame,
                nocDepositedFee,nocChallan,nocDepositedate,nocAddress,
                nocMobileNO,nocLandline,nocMobOfGurdain,nocModeofrecieve);
        return mymodel;
    }
    public static cardModel FindOne(int nocModel_ID, Context context){

        List<cardModel> nocmodels = new ArrayList<cardModel>();
        String line;
        File path = context.getFilesDir();
        File readFrom = new File(path, FILE_NAME);
        try {
            @SuppressWarnings("resource")
            BufferedReader br = new BufferedReader(new FileReader(readFrom));

            while ((line = br.readLine()) != null) {
                cardModel nocMymodel = nocLinetoModel(line);
                if (nocMymodel.getNocFormID() == nocModel_ID)
                    nocmodels.add(nocMymodel);


                return nocMymodel;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    return null;
    }
    public static cardModel DelOne(int nocModel_ID) {

        FileWriter filewriter;
        List<cardModel> persons = FindAll();
        Context context = null;
        cardModel person = cardFormDB.FindOne(nocModel_ID,context);
        try {
            filewriter = new FileWriter(FILE_NAME);

            for(int i=0;i<persons.size();i++) {
                if(persons.get(i).getNocFormID()!=nocModel_ID) {
                    filewriter.append(persons.get(i).toString());
                    filewriter.append("\n");
                }
            }
            persons.add(person);
            filewriter.flush();
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
    public static List<cardModel> FindAll(){
        List<cardModel> nocmodels= new ArrayList<cardModel>();
        String line ;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            while((line=bufferedReader.readLine()) != null) {
                cardModel nocMymodel = nocLinetoModel(line);
                nocmodels.add(nocMymodel);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return nocmodels;
    }
}
