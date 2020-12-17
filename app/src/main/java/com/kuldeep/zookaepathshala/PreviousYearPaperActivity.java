package com.kuldeep.zookaepathshala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PreviousYearPaperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_year_paper);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(PreviousYearPaperActivity.this, DashBoardActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();

    }
}