package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Save_Details extends AppCompatActivity {
    TextView op1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_details);


        Intent i = getIntent();
        TextView op1 = findViewById(R.id.op1);
        TextView op2 = findViewById(R.id.op2);
        TextView op3 = findViewById(R.id.op3);


//                retrival of op3
        String output1 = getIntent().getStringExtra("op1");
        String output2 = getIntent().getStringExtra("op2");
        String output3 = getIntent().getStringExtra("op3");

        op1.setText(output1);  //Display output1
        op2.setText(output2);  //Display output2
        op3.setText(output3);  //Display output3



//        String s = name_intent.getStringExtra("First Name");
//        name = (TextView) findViewById(R.id.name);
//        name.setText( i.getStringExtra("Name") );
//
//        getemail = findViewById(R.id.getemail);
//        getemail.setText( i.getStringExtra("Email"));
//
//        bname = findViewById(R.id.bname);
//        bname.setText( i.getStringExtra("Address"));
//
//        getbank_name = findViewById(R.id.getbank_name);
//        getbank_name.setText( i.getStringExtra("BankName"));




//        op1 = findViewById(R.id.op1);
//        retrival op1
//        op1.setText(i.getStringExtra("output1"));
//        op1.setText(i.getStringExtra("output1"));
//        String output1 = getIntent().getStringExtra("op1");
//        op1.setText(output1);




    }
}


//https://github.com/ShivaniAgarwal2001/Bank-Details-App/commit/7199a145f3d63753f6970bea2c4fe4773131a07d
//github repo 