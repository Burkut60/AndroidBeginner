package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity  {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button buttonTextExChange = findViewById(R.id.buttonTrxtExChange);
        Button buttonFlagsActivity = findViewById(R.id.buttonFlagsActivity);

        buttonTextExChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, TextExchangeActivity.class);
                startActivity(intent);
            }
        });
        buttonFlagsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFlags = new Intent(MenuActivity.this, FlagsActivity.class);
                startActivity(intentFlags);
            }
        });
    }
}
