package com.kuldeep.zookaepathshala;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list_v);
        setSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private ActionBar setSupportActionBar() {
        return null;
    }
}