package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class Personal_Details extends AppCompatActivity {
//    Global variables
    Button submit;
    EditText firstname, lastname, email,contact, age, nation;
    RadioGroup gender;
    RadioButton male, female;
    String name, getemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        firstname = findViewById(R.id.firstname);
        lastname= findViewById(R.id.lastname);
//        Concatinate Name
        name = firstname.getText().toString() +" "+lastname.getText().toString();    //        ................................

        email= findViewById(R.id.email);
        getemail = email.getText().toString();   //        ................................

        contact = findViewById(R.id.contact);
        gender = findViewById(R.id.gender);
        age= findViewById(R.id.age);
        nation = findViewById(R.id.nation);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder op1 = new StringBuilder();
//                op1.setText("");
                op1.append("Name: "+firstname.getText().toString()+" "+lastname.getText().toString()+"\n");
                op1.append("Email: "+email.getText().toString()+"\n");
                op1.append("Contact: "+contact.getText().toString()+"\n");
                int gender_id = gender.getCheckedRadioButtonId();
                if (gender_id == R.id.male){
                    op1.append("Gender: Male\n");
                }
                else {
                    op1.append("Gender: Female\n");
                }
                op1.append("Age: "+age.getText().toString()+"\n");
                op1.append("Nation: "+nation.getText().toString()+"\n");

                Intent submit_intent = new Intent(Personal_Details.this,Address_Details.class);

                submit_intent.putExtra("op1", op1.toString());
                Toast.makeText(Personal_Details.this,"Details Saved",Toast.LENGTH_SHORT).show();

//                submit_intent.putExtra("Name", firstname.getText().toString() +" "+lastname.getText().toString());
//                submit_intent.putExtra("Email", email.getText().toString());
//                Toast.makeText(getApplicationContext(), name , Toast.LENGTH_SHORT).show();   // name+" "+getemail
//                Toast.makeText(getApplicationContext(), getemail , Toast.LENGTH_SHORT).show();
                
                startActivity(submit_intent);
//                finish();
            }
        });
    }

}