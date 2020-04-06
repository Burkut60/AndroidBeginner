package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextExchangeActivity extends Activity implements View.OnClickListener {

    private TextView textView2;
    private TextView textView3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        button = findViewById(R.id.buttonFlagsActivity);

        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bottom:
            case R.id.textView2:
            case R.id.textView3:
                PressingButton(textView2, textView3);
                break;
        }
    }

    public void PressingButton(TextView a, TextView b) {
        Drawable color = a.getBackground();
        Drawable color2 = b.getBackground();

        a.setBackground(color2);
        b.setBackground(color);

        String a1 = a.getText().toString();
        String b1 = b.getText().toString();

        a.setText(b1);
        b.setText(a1);
    }
}

