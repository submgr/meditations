package com.example.meditations;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class AuthInterface extends Auth{
    Context mContext;
    public HomeScreen activity;

    AuthInterface(Context c){
        mContext = c;
    }
    @JavascriptInterface
    public void showToast(String toast){
        this.activity = activity;
        Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
        startActivity(new Intent(getApplicationContext(), HomeScreen.class));
    }
}
