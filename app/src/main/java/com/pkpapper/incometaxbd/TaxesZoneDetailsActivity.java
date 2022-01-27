package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TaxesZoneDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxes_zone_details);

        getSupportActionBar().hide();
    }
}