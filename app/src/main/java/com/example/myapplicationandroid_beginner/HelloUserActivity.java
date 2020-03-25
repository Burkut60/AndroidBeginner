package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HelloUserActivity extends Activity {
    private Button button;
    private TextView textOne;
    private TextView textTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_user);

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
