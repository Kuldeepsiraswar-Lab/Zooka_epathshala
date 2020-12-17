package com.kuldeep.zookaepathshala;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoardActivity extends AppCompatActivity {
    FrameLayout button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);



        button1 =(FrameLayout)findViewById(R.id.bookclick);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(DashBoardActivity.this,ClassActivity.class));
            }
        });


        button2 =(FrameLayout)findViewById(R.id.modalpaperclick);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(DashBoardActivity.this,ModalPaperActivity.class));
            }
        });


        button3 =(FrameLayout)findViewById(R.id.boardresultclick);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashBoardActivity.this,BoardResultActivity.class));
            }
        });

        button4 =(FrameLayout)findViewById(R.id.importantquestion);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashBoardActivity.this,ImportantQuestionActivity.class));
            }
        });

        button5 =(FrameLayout)findViewById(R.id.previousyearclick);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              startActivity(new Intent(DashBoardActivity.this,PreviousYearPaperActivity.class));
            }
        });


        button6 =(FrameLayout)findViewById(R.id.newsupdate);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashBoardActivity.this,NewsUpdateActivity.class));
            }
        });
    }
}