package com.example.alc40phase1challenge_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void about(View v){
        Intent aboutIntent = new Intent(MainActivity.this, AboutALC.class);
        startActivity(aboutIntent);

    }

    public void profile(View v){
        Intent aboutIntent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(aboutIntent);

    }
}
