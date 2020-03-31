package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
    private Button buttonMenu;
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
         buttonMenu = findViewById(R.id.buttonMenu);

         buttonMenu.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent (MenuActivity.this ,TextExchangeActivity.class);
                 startActivity(intent);
             }
         });
    }
}
