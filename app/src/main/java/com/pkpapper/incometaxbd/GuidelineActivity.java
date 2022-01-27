package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GuidelineActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);

        getSupportActionBar().hide();

        pdfView = findViewById(R.id.pdfViewer);
        pdfView.fromAsset("guideline.pdf").load();

    }
}