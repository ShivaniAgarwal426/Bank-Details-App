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
                Bank_Details();
                Toast.makeText(Address_Details.this,"Details Saved",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void Bank_Details(){
//        retrival
        String name = getIntent().getStringExtra("Name");
        String getemail = getIntent().getStringExtra("Email");

        Intent submit_intent = new Intent(this,Bank_Details.class);

        submit_intent.putExtra("Name", name);
        submit_intent.putExtra("Email", getemail);
        submit_intent.putExtra("Address", building_name.getText().toString());
//        retrive in next activity


        startActivity(submit_intent);
//        finish();
    }
}