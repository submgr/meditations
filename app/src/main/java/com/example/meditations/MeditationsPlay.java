package com.example.meditations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.IOException;

public class MeditationsPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditations_play);
        getSupportActionBar().hide();

        WebView webView = findViewById(R.id.vw_element);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //webView.addJavascriptInterface(new AuthInterface(this), "Android");
        webView.loadUrl("https://test.deqstudio.com/medit/bg/bg1/");

        String url = "https://test.deqstudio.com/medit/get_audio.php?session_id="; // your URL here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();

    }
}