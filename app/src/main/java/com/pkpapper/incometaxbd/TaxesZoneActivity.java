package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaxesZoneActivity extends AppCompatActivity {

    private TextView telephoneNumber,hisabCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxes_zone);


        getSupportActionBar().hide();

        telephoneNumber = findViewById(R.id.telephonenumber);
        hisabCode = findViewById(R.id.hisabcode);

        telephoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TaxesZoneActivity.this,TaxesZoneDetailsActivity.class);
                startActivity(i);
            }
        });

        hisabCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaxesZoneActivity.this,HisabCodeActivity.class);
                startActivity(intent);
            }
        });
    }
}