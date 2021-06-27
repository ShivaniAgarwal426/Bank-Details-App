package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Save_Details extends AppCompatActivity {
    TextView op1, name, getemail, bname, getbank_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_details);


        Intent i = getIntent();
//        String s = name_intent.getStringExtra("First Name");
        name = (TextView) findViewById(R.id.name);
        name.setText( i.getStringExtra("Name") );

        getemail = findViewById(R.id.getemail);
        getemail.setText( i.getStringExtra("Email"));

        bname = findViewById(R.id.bname);
        bname.setText( i.getStringExtra("Address"));

        getbank_name = findViewById(R.id.getbank_name);
        getbank_name.setText( i.getStringExtra("BankName"));

//        op1 = findViewById(R.id.op1);
////        retrival op1
////        op1.setText(i.getStringExtra("output1"));
//        String output1 = getIntent().getStringExtra("output1");
//        op1.setText(i.getStringExtra("output1"));


    }
}