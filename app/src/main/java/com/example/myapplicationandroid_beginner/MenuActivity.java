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

        Button buttonTextExChange = findViewById(R.id.buttonTrxtExChange);
        Button buttonFlagsActivity = findViewById(R.id.button1Activity);
        Button buttonLoginLinear = findViewById(R.id.loginButton);

        buttonTextExChange.setOnClickListener(this);
        buttonFlagsActivity.setOnClickListener(this);
        buttonLoginLinear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTrxtExChange:
                Intent intent = new Intent(this, TextExchangeActivity.class);
                startActivity(intent);
                break;

            case R.id.button1Activity:
                Intent intentFlags = new Intent(this, FlagsActivity.class);
                startActivity(intentFlags);
                break;

            case R.id.loginButton:
                Intent intentLogin = new Intent(this, LoginLinearActivity.class);
                startActivity(intentLogin);
                break;
        }
    }
}
