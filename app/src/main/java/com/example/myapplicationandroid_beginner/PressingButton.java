package com.example.myapplicationandroid_beginner;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class PressingButton {


    void dataChange(TextView a, TextView b){
     Drawable color =  a.getBackground();
     Drawable color2 = b.getBackground();

     a.setBackground(color2);
     b.setBackground(color);


       String a1 = a.getText().toString();
       String b1 = b.getText().toString();

        a.setText(b1);
        b.setText(a1);


    }
}
