package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class ImageActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        final EditText imageForText = findViewById(R.id.imageText);
        final ImageView imageForImageView = findViewById(R.id.imageView);
        Button imageForButton = findViewById(R.id.imageButton);




        imageForButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageForImageView);
            }
        });


    }
}
