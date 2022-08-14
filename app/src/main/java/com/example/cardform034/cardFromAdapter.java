package com.example.cardform034;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class cardFromAdapter extends RecyclerView.Adapter<cardFromAdapter.MyViewHolder> {
    public static List<cardModel> nocModels = new ArrayList<>();
    cardFormDBMS db ;
    FormActivity act = new FormActivity();
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);


        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(nocModels.get(position).getName());
        holder.RegistrationNo.setText(nocModels.get(position).getRegistrationNo());
        holder.RollNo.setText(nocModels.get(position).getRollNo());
        holder.ModeOfReceive.setText(nocModels.get(position).getModeOfReceive());
        //Log.d("data-1", "outdel: " + nocModels.get(position).getRollNo());

        holder.itemView.findViewById(R.id.btnDel).setOnClickListener(v ->{
            String Rolltodel = nocModels.get(position).getRollNo();
            Log.d("data-1", "indel: " + Rolltodel);


            Log.d("data-1", "after main method : " + Rolltodel);
            nocModels.remove(position);
            notifyItemRemoved(position);
            notifyItemRangeChanged(position,nocModels.size());
            Log.d("data-1", "before wala: " + Rolltodel);
            boolean check = db.deleteUserData(Rolltodel);
            Log.d("data-1", "after method in adapter: " + check);
        });




    }



    @Override
    public int getItemCount() {
        return nocModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
   {
    TextView name;
    TextView RegistrationNo;
    TextView RollNo;
    TextView ModeOfReceive;

       public MyViewHolder(@NonNull View itemView) {
           super(itemView);
           name = itemView.findViewById(R.id.txtviewNameloc);
           RegistrationNo  = itemView.findViewById(R.id.txtviewregnoloc);
           RollNo = itemView.findViewById(R.id.txtviewRollnuloc);
           ModeOfReceive = itemView.findViewById(R.id.txtviewModeloc);


       }

   }

    public List<cardModel> getNocModels() {
        return nocModels;
    }

    public void setNocModels(List<cardModel> nocModels) {
        this.nocModels = nocModels;
    }
}

