package com.example.deliciasweb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgBolivia = findViewById(R.id.imgBolivia);
        ImageView imgIndia = findViewById(R.id.imgIndia);
        ImageView imgItaly = findViewById(R.id.imgItaly);
        ImageView imgJapan = findViewById(R.id.imgJapan);
        ImageView imgMexico = findViewById(R.id.imgMexico);

        imgBolivia.setOnClickListener(v -> openCountryActivity("Bolivia"));
        imgIndia.setOnClickListener(v -> openCountryActivity("India"));
        imgItaly.setOnClickListener(v -> openCountryActivity("Italia"));
        imgJapan.setOnClickListener(v -> openCountryActivity("Japon"));
        imgMexico.setOnClickListener(v -> openCountryActivity("Mexico"));
    }

    private void openCountryActivity(String country) {
        Intent intent = new Intent(MainActivity.this, CountryActivity.class);
        intent.putExtra("country", country);
        startActivity(intent);
    }
}
