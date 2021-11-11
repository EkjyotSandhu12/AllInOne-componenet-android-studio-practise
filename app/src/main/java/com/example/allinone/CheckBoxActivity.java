package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        CheckBox cb = findViewById(R.id.testCheckbox);

        Button check = findViewById(R.id.btn_checked);
        Button uncheck = findViewById(R.id.btn_unchecked);
        Button enable = findViewById(R.id.btn_enable);
        Button disable = findViewById(R.id.btn_disable);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String state = b?"checked":"unchecked";
                Toast.makeText(CheckBoxActivity.this, state, Toast.LENGTH_SHORT).show();
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb.setChecked(true);
                cb.setBackgroundColor(Color.parseColor("#bdbdbd"));
            }
        });
        uncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb.setChecked(false);
                cb.setTextColor(getResources().getColor(R.color.teal_200));
            }
        });
        enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb.setEnabled(true);
                cb.setText("enabled");
            }
        });
        disable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb.setEnabled(false);
                cb.setText("disabled");
                cb.setTextColor(getResources().getColor(R.color.white));
                cb.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });
    }
}