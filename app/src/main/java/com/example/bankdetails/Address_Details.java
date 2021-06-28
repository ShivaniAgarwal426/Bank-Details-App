package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Address_Details extends AppCompatActivity {
    Button submit;
    EditText flat_no, building_name, area, city, state;
    String bname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_details);

        flat_no = findViewById(R.id.flat_no);
        building_name = findViewById(R.id.building_name);
        bname = building_name.getText().toString();  //        ................................
        area = findViewById(R.id.area);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                retrival of op1
                String output1 = getIntent().getStringExtra("op1");

                StringBuilder op2 =new StringBuilder();
                op2.append("Flat Number: "+flat_no.getText().toString()+"\n");
                op2.append("Building Name: "+building_name.getText().toString()+"\n");
                op2.append("Area: "+area.getText().toString()+"\n");
                op2.append("City: "+city.getText().toString()+"\n");
                op2.append("State: "+state.getText().toString()+"\n");


                Intent submit_intent = new Intent(Address_Details.this,Bank_Details.class);

                submit_intent.putExtra("op1",output1);
                submit_intent.putExtra("op2", op2.toString());

                Toast.makeText(Address_Details.this,"Details Saved",Toast.LENGTH_SHORT).show();
                startActivity(submit_intent);
            }
        });
    }


    public void Bank_Details(){
////        retrival
//        String name = getIntent().getStringExtra("Name");
//        String getemail = getIntent().getStringExtra("Email");
//
//        Intent submit_intent = new Intent(this,Bank_Details.class);
//
//        submit_intent.putExtra("Name", name);
//        submit_intent.putExtra("Email", getemail);
//        submit_intent.putExtra("Address", building_name.getText().toString());
////        retrive in next activity
//
//
//        startActivity(submit_intent);
//        finish();
    }
}