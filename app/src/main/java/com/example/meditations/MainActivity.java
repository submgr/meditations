package com.example.meditations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String APP_CACHED_INFO = "YOUR_TAG";
    private static final String USAGE_STATE = "DATA_TAG";
    private static final String data = "oh, what a data!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {
                SharedPreferences preferences = getSharedPreferences("app_data", 0);

                String value = preferences.getString("usage_state",null);
                if (value != null) {
                    // the key does not exist
                    startActivity(new Intent(MainActivity.this, WelcomeScreen.class));
                } else {
                    // handle the value
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "[DEBUG]: welcome page was passed before", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }, 3000);

    }

}