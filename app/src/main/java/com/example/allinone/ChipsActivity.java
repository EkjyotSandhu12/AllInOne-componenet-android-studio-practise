package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

public class ChipsActivity extends AppCompatActivity {

    ChipGroup cg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chips);

        { //input chips

            cg = findViewById(R.id.inputchipsgroup);
            EditText et = findViewById(R.id.inputchipedittext);
            Button btn = findViewById(R.id.inputchipbutton);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    inputchips(et);
                }
            });


        } //input chips

        { //Filter Chips


        } //Filter Chips

    }

    public void inputchips(EditText et){
        Chip ch = new Chip(this);

        ChipDrawable chipDrawable = ChipDrawable.createFromAttributes(this,null,
                0,R.style.Widget_MaterialComponents_Chip_Entry);

        ch.setChipDrawable(chipDrawable);

        ch.setCheckable(false);
        ch.setClickable(false);
        ch.setChipIconResource(R.drawable.test_icon);
        ch.setIconStartPadding(3f);
        ch.setPadding(60,10,60,10);
        ch.setText(et.getText().toString());

        ch.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cg.removeView(view);
            }
        });

        cg.addView(ch);
    }
}