package com.example.meditations;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class AuthInterface extends Auth{
    Context mContext;

    AuthInterface(Context c){
        mContext = c;
    }

    @JavascriptInterface
    public void showToast(String toast){
        Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
        mContext.startActivity(new Intent(mContext, HomeScreen.class));
    }
}
