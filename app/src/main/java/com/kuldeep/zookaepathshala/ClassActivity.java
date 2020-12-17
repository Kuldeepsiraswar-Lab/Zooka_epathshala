package com.kuldeep.zookaepathshala;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class ClassActivity extends AppCompatActivity {
    FrameLayout button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 =(FrameLayout)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Calendar Pressed",Toast.LENGTH_SHORT).show();
            }
        });


        button2 =(FrameLayout)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Groceries Pressed",Toast.LENGTH_SHORT).show();
            }
        });


        button3 =(FrameLayout)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Location Pressed",Toast.LENGTH_SHORT).show();
            }
        });

        button4 =(FrameLayout)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Activity Pressed",Toast.LENGTH_SHORT).show();
            }
        });

        button5 =(FrameLayout)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"To do Pressed",Toast.LENGTH_SHORT).show();
            }
        });


        button6 =(FrameLayout)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Setting Pressed",Toast.LENGTH_SHORT).show();
            }
        });
        button7 =(FrameLayout)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Setting Pressed",Toast.LENGTH_SHORT).show();
            }
        });
        button8 =(FrameLayout)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Setting Pressed",Toast.LENGTH_SHORT).show();
            }
        });
        button9 =(FrameLayout)findViewById(R.id.button8);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Setting Pressed",Toast.LENGTH_SHORT).show();
            }
        });
        button10 =(FrameLayout)findViewById(R.id.button8);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Setting Pressed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}