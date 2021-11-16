package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            findViewById(R.id.ButtonView).setOnClickListener(this);
            findViewById(R.id.ImageBtnView).setOnClickListener(this);
            findViewById(R.id.TextView).setOnClickListener(this);
            findViewById(R.id.EditTextView).setOnClickListener(this);
            findViewById(R.id.ChipView).setOnClickListener(this);
            findViewById(R.id.CheckBoxView).setOnClickListener(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu);
        getMenuInflater().inflate(R.menu.side_navigation_menu, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {

            case R.id.ButtonView:
                intent = new Intent(this, ButtonActivity.class);
                startActivity(intent);
                break;
            case R.id.ImageBtnView:
                intent = new Intent(this, ImageButtonActivity.class);
                startActivity(intent);
                break;
            case R.id.TextView:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.EditTextView:
                intent = new Intent(this, EditTextActivity.class);
                startActivity(intent);
                break;

            case R.id.ChipView:
                intent = new Intent(this, ChipsActivity.class);
                startActivity(intent);
                break;
            case R.id.CheckBoxView:
                intent = new Intent(this, CheckBoxActivity.class);
                startActivity(intent);
                break;
        }

    }
}