package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SpotAssessmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_assessment);

        getSupportActionBar().hide();
    }
}