package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView personal_detail, address_detail, bank_detail, save_detail ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personal_detail = findViewById(R.id.personal_detail);
        address_detail = findViewById(R.id.address_detail);
        bank_detail = findViewById(R.id.bank_detail);
        save_detail = findViewById(R.id.save_detail);

        personal_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Personal_Details();
                Intent click_pd = new Intent(MainActivity.this,Personal_Details.class);
                startActivity(click_pd);
            }
        });
        address_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Address_Details();
            }
        });
        bank_detail.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Bank_Details();
           }
        });
        save_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save_Details();
            }
        });
    }
    private void Personal_Details(){
        Intent click_pd = new Intent(MainActivity.this,Personal_Details.class);
        startActivity(click_pd);
        finish();
    }
    private void Address_Details(){
        Intent click_ad = new Intent(MainActivity.this,Address_Details.class);
        startActivity(click_ad);
        finish();
    }
    private void Bank_Details(){
        Intent click_bd = new Intent(MainActivity.this,Bank_Details.class);
        startActivity(click_bd);
        finish();
    }
    private void Save_Details(){
        Intent click_sd = new Intent(MainActivity.this,Save_Details.class);
        startActivity(click_sd);
        finish();
    }
}