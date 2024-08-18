package com.example.firabaseex;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class NextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Log.d("NextActivity", "NextActivity started");
    }
}