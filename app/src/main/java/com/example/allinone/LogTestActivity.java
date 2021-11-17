package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LogTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_test);


        Log.v("VERBOSE", "lowest priority");

        Log.d("Debug", "For Debugging");
        Log.i("Information", "Info for the the programmer");
        Log.w("Warning", "Just a simple warning");

        Log.e("Error", "High Priority Error");
        Log.wtf("ASSERT", "Highest Priority Error");
    }
}