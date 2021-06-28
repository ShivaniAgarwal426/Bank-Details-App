package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bank_Details extends AppCompatActivity {
    Button submit;
    EditText bank_name, acc_type, acc_no, ifsc, branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);

        bank_name = findViewById(R.id.bank_name);
        String getbank_name = bank_name.getText().toString();  //        ................................

        acc_type = findViewById(R.id.acc_type);
        acc_no = findViewById(R.id.acc_no);
        ifsc = findViewById(R.id.ifsc);
        branch = findViewById(R.id.branch);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                retrival of op2
                String output1 = getIntent().getStringExtra("op1");
                String output2 = getIntent().getStringExtra("op2");

                StringBuilder op3 =new StringBuilder();
                op3.append("Name of Bank: "+bank_name.getText().toString()+"\n");
                op3.append("Account Type: "+acc_type.getText().toString()+"\n");
                op3.append("Account Number: "+acc_no.getText().toString()+"\n");
                op3.append("IFSC Code: "+ifsc.getText().toString()+"\n");
                op3.append("Branch: "+branch.getText().toString()+"\n");

//                String name, getemail, bname;
//                name = getIntent().getStringExtra("Name");
//                getemail = getIntent().getStringExtra("Email");
//                bname = getIntent().getStringExtra("Address");
//
//
//
                Intent submit_intent = new Intent(Bank_Details.this,Save_Details.class);

                submit_intent.putExtra("op1",output1);
                submit_intent.putExtra("op2",output2);
                submit_intent.putExtra("op3",op3.toString());
//
//                submit_intent.putExtra("Name", name);
//                submit_intent.putExtra("Email", getemail);
//                submit_intent.putExtra("Address", bname);
//                submit_intent.putExtra("BankName", bank_name.getText().toString());

                Toast.makeText(Bank_Details.this, "Detail saved", Toast.LENGTH_SHORT).show();
                startActivity(submit_intent);
//                finish();
            }
        });
    }
}