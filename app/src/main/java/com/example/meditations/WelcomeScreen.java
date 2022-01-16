package com.example.meditations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        getSupportActionBar().hide();
    }

    public void lets_start(View view){
        startActivity(new Intent(WelcomeScreen.this, Auth.class));
        //SharedPreferences preferences = getSharedPreferences("app_data", 0);
        //SharedPreferences.Editor editor = preferences.edit();
        //editor.putString("usage_state", "began");
        //editor.apply();
    }
}