package com.example.vehicle;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private Button btnProfile, btnClaims, btnShare, btn_settings,btnLogout;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnProfile = findViewById(R.id.btn_profile);
        btnClaims = findViewById(R.id.btn_claims);
        btnShare = findViewById(R.id.btn_share);
        btn_settings = findViewById(R.id.btn_settings);
        btnShare = findViewById(R.id.btn_share);
        btnLogout = findViewById(R.id.btn_logout);


        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("username")) {
            username = intent.getStringExtra("username");
        } else {

            username = "User";
        }


        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
                finish();
            }
        });

        btnClaims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Claims.class);
                startActivity(intent);
                finish();
            }
        });
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Settings.class);
                startActivity(intent);
                finish();


            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sharing functionality (e.g., share app link)
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out cool app!");
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout functionality
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close current activity
            }
        });
    }
}