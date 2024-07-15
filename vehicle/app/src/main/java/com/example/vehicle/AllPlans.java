package com.example.vehicle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AllPlans extends AppCompatActivity {

    private CheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
    private Button allplans_select, claim_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allplans);

        claim_back = findViewById(R.id.claim_back);
        allplans_select = findViewById(R.id.allplans_select);
        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        checkbox4 = findViewById(R.id.checkbox4);
        checkbox5 = findViewById(R.id.checkbox5);

        // Set click listeners for checkboxes
        checkbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCheckboxClick(checkbox1);
            }
        });
        checkbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCheckboxClick(checkbox2);
            }
        });
        checkbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCheckboxClick(checkbox3);
            }
        });
        checkbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCheckboxClick(checkbox4);
            }
        });
        checkbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCheckboxClick(checkbox5);
            }
        });

        claim_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllPlans.this, Claims.class);
                startActivity(intent);
                finish();
            }
        });
        allplans_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AllPlans.this, "Claimed Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void handleCheckboxClick(CheckBox clickedCheckbox) {
        // Uncheck all checkboxes except the clicked one
        if (clickedCheckbox == checkbox1) {
            checkbox2.setChecked(false);
            checkbox3.setChecked(false);
            checkbox4.setChecked(false);
            checkbox5.setChecked(false);
        } else if (clickedCheckbox == checkbox2) {
            checkbox1.setChecked(false);
            checkbox3.setChecked(false);
            checkbox4.setChecked(false);
            checkbox5.setChecked(false);
        } else if (clickedCheckbox == checkbox3) {
            checkbox1.setChecked(false);
            checkbox2.setChecked(false);
            checkbox4.setChecked(false);
            checkbox5.setChecked(false);
        } else if (clickedCheckbox == checkbox4) {
            checkbox1.setChecked(false);
            checkbox2.setChecked(false);
            checkbox3.setChecked(false);
            checkbox5.setChecked(false);
        } else if (clickedCheckbox == checkbox5) {
            checkbox1.setChecked(false);
            checkbox2.setChecked(false);
            checkbox3.setChecked(false);
            checkbox4.setChecked(false);
        }
    }
}
