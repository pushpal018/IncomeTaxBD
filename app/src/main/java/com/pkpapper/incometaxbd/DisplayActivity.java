package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {


    private TextView totaltax,payableTax,totalTaxableIncome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        getSupportActionBar().hide();

        totaltax = findViewById(R.id.totalTaxTv);
        payableTax = findViewById(R.id.paybleTax);
        totalTaxableIncome = findViewById(R.id.totalTaxableIncomeTv);


        Intent intent = getIntent();
        String str = intent.getStringExtra("tax");
        String str2 = intent.getStringExtra("taxableIncome");


        totaltax.setText(str);
        payableTax.setText("Payable Tax : "+str+" tk");
        totalTaxableIncome.setText("Total Taxable Income : "+str2+" tk");
    }


}