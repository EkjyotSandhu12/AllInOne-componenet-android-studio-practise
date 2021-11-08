package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);

        String[] car = {"buggati", "hyundai", "BMW", "audi", "mercedes", "tata", "maruti suzuki"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, car);

        AutoCompleteTextView at = findViewById(R.id.autotextcomplete);
        at.setThreshold(1);
        at.setAdapter(adapter);

        EditText et = findViewById(R.id.disablededittext);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setEnabled(false);
                et.setText("DISABLED!!");
                new CountDownTimer(5000, 5000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish() {
                        et.setEnabled(true);
                        et.setText("Enabled!");
                    }
                }.start();

            }
        });
    }
}