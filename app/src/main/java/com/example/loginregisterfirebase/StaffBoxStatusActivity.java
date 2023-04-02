package com.example.loginregisterfirebase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StaffBoxStatusActivity extends AppCompatActivity {
    //ArrayList <type> variable_name
    //The ArrayList holds all the BoxStatusVariables and sends it to the Adapter
    private ArrayList<BoxStatusVariables> BoxStatusList= new ArrayList<>();
    //This is a very brute force method... But my images are aligned with my For-Loop iterations in SetBoxStatus
    private int[] BoxImages={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_tester};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_boxstatus);
        RecyclerView recyclerView= findViewById(R.id.recyclerview);
        BoxStatusList=new ArrayList<>();

        setBoxStatusInfo();
        RecyclerAdapter adapter= new RecyclerAdapter(this,BoxStatusList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void setBoxStatusInfo(){
        String[] RV_Box_Address= getResources().getStringArray(R.array.Box_Address_RV);
        String[] RV_Postal_Code= getResources().getStringArray(R.array.Postal_Code_RV);
        String[] RV_Box_Status= getResources().getStringArray(R.array.Box_Status_RV);

        for (int i = 0 ; i<RV_Box_Address.length;i++){
            BoxStatusList.add(new BoxStatusVariables(RV_Box_Address[i],
                            RV_Postal_Code[i],
                            RV_Box_Status[i],
                            BoxImages[i]));
        }
    }
}
