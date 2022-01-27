package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private NeumorphButton etin,taxZone,calculator,guideline,spot,faq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();


        etin = findViewById(R.id.etin);
        taxZone = findViewById(R.id.taxzone);
        calculator = findViewById(R.id.calculator);
        guideline = findViewById(R.id.guidelineBtn);
        spot = findViewById(R.id.spot);
        faq = findViewById(R.id.faq);

        etin.setOnClickListener(this);
        taxZone.setOnClickListener(this);
        calculator.setOnClickListener(this);
        guideline.setOnClickListener(this);
        spot.setOnClickListener(this);
        faq.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.etin){
            Intent etinIntent = new Intent(MainActivity.this,E_TinActivity.class);
            startActivity(etinIntent);
        }else if (id ==R.id.taxzone){
            Intent taxzoneIntent = new Intent(MainActivity.this,TaxesZoneActivity.class);
            startActivity(taxzoneIntent);

        }else if (id ==R.id.calculator){
            Intent calculatorIntent = new Intent(MainActivity.this,NewTextActivity.class);
            startActivity(calculatorIntent);

        }else if (id ==R.id.guidelineBtn){
            Intent guidelineIntent = new Intent(MainActivity.this,GuidelineActivity.class);
            startActivity(guidelineIntent);

        }else if (id ==R.id.spot){
            Intent spotIntent = new Intent(MainActivity.this,SpotAssessmentActivity.class);
            startActivity(spotIntent);

        }else if (id ==R.id.faq){
            Intent faqIntent = new Intent(MainActivity.this,TaxReturnGuidelineActivity.class);
            startActivity(faqIntent);

        }


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Confirm exit!!");
        alertDialogBuilder.setIcon(R.drawable.exit);
        alertDialogBuilder.setMessage("Do you want to exit?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                //finishAndRemoveTask(); //ai ine ta likle background tekhao app ta cole jabe
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You are clicked on cancel", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNeutralButton("Rate this app", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Rate this App", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}