package com.example.allinone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chips);

        inputchips();
        filterChip();
    }

    public void inputchips() {
        ChipGroup cg = findViewById(R.id.inputchipsgroup);
        EditText et = findViewById(R.id.inputchipedittext);
        Button btn = findViewById(R.id.inputchipbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chip ch = new Chip(ChipsActivity.this);

                ChipDrawable chipDrawable = ChipDrawable.createFromAttributes(ChipsActivity.this, null,
                        0, R.style.Widget_MaterialComponents_Chip_Entry);

                ch.setChipDrawable(chipDrawable);

                ch.setCheckable(false);
                ch.setClickable(false);
                ch.setChipIconResource(R.drawable.test_icon);
                ch.setIconStartPadding(3f);
                ch.setPadding(60, 10, 60, 10);
                ch.setText(et.getText().toString());

                ch.setOnCloseIconClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cg.removeView(view);
                    }
                });

                cg.addView(ch);
            }
        });


    }

    public void filterChip(){


        ArrayList<String> selectedChips = new ArrayList<String>();

        CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked) {

                    selectedChips.add(compoundButton.getText().toString());

                } else {

                    selectedChips.remove(compoundButton.getText().toString());
                }

            }
        };

        Chip c = findViewById(R.id.chip1);
        c.setOnCheckedChangeListener(checkedChangeListener);
        c = findViewById(R.id.chip2);
        c.setOnCheckedChangeListener(checkedChangeListener);
        c = findViewById(R.id.chip3);
        c.setOnCheckedChangeListener(checkedChangeListener);
        c = findViewById(R.id.chip4);
        c.setOnCheckedChangeListener(checkedChangeListener);
        c = findViewById(R.id.chip5);
        c.setOnCheckedChangeListener(checkedChangeListener);

        findViewById(R.id.filterButton).setOnClickListener(new View.OnClickListener() {
            TextView tv = findViewById(R.id.FilterChipOutput);
            @Override
            public void onClick(View v) {
                tv.setText("");
                for (String s : selectedChips) {
                    tv.setText(tv.getText() + " " + s);
                }

            }

        });


    }
}