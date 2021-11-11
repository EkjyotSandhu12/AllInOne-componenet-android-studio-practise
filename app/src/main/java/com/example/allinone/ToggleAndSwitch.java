package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleAndSwitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_and_switch);



        ToggleButton Tb1 =findViewById(R.id.Tb1);
        ToggleButton Tb2 =findViewById(R.id.Tb2);
        ImageView imageView =findViewById(R.id.imageView);

        CompoundButton.OnCheckedChangeListener compound = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String state = isChecked?"checked":"unchecked";
                Toast.makeText(ToggleAndSwitch.this, state, Toast.LENGTH_SHORT).show();
            }
            };

        Tb1.setOnCheckedChangeListener(compound);
        Tb2.setOnCheckedChangeListener(compound);

        Tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Tb1.isChecked()) {
                    imageView.setColorFilter(Color.parseColor("#81F10606"));
                } else {
                    imageView.setColorFilter(null);
                }
            }
        });
        Tb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Tb2.isChecked()) {
                    imageView.setColorFilter(Color.parseColor("#8103A9F4"));
                } else {
                    imageView.setColorFilter(null);
                }
            }
        });

    }
}