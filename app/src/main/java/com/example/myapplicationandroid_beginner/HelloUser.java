package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HelloUser extends Activity {
    Button button;
    TextView textOne;
    TextView textTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitt_helloo_user);

        button = findViewById(R.id.button2);
        textOne = findViewById(R.id.textView);
        textTwo = findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textOne.setText(" Кнопка нажата");
            }
        });

    }
}
