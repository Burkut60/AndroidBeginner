package com.example.myapplicationandroid_beginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class ProfileActivity extends Activity {

ImageView profileImage;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileImage = findViewById(R.id.profileImage);

        Picasso.get().load("https://i.imgur.com/DvpvklR.png").transform(new ImageActivity.CircleTransform()).into(profileImage);
    }
}



