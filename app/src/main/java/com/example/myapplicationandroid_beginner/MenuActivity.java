package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button textExChangeButton = findViewById(R.id.textExChangeButton);
        Button flagsActivityButton = findViewById(R.id.flagsButton);
        Button loginLinearButton = findViewById(R.id.loginButton);
        Button imageActivityButton = findViewById(R.id.imageActivityButton);
        Button profileActivityButton = findViewById(R.id.profileActivityButton);

        textExChangeButton.setOnClickListener(this);
        flagsActivityButton.setOnClickListener(this);
        loginLinearButton.setOnClickListener(this);
        imageActivityButton.setOnClickListener(this);
        profileActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textExChangeButton:
                Intent intent = new Intent(this, TextExchangeActivity.class);
                startActivity(intent);
                break;

            case R.id.flagsButton:
                Intent intentFlags = new Intent(this, FlagsActivity.class);
                startActivity(intentFlags);
                break;

            case R.id.loginButton:
                Intent intentLogin = new Intent(this, LoginLinearActivity.class);
                startActivity(intentLogin);
                break;

            case R.id.imageActivityButton:
                Intent intentImage = new Intent(this, ImageActivity.class);
                startActivity(intentImage);
                break;

            case R.id.profileActivityButton:
                ;
                Intent intentProfileActivity = new Intent(this, ProfileActivity.class);
                startActivity(intentProfileActivity);
                break;
        }
    }
}
