package com.example.myapplicationandroid_beginner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextExchangeActivity extends AppCompatActivity {
    private TextView textView2;
    private TextView textView3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
PressingButton pressingButton = new PressingButton();
pressingButton.dataChange(textView2,textView3);
            }
        });

textView2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        PressingButton pressingButton = new PressingButton();
        pressingButton.dataChange(textView2,textView3);
    }
});

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PressingButton pressingButton = new PressingButton();
                pressingButton.dataChange(textView2,textView3);

            }


        });
    }
}

