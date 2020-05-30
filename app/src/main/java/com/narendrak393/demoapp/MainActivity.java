package com.narendrak393.demoapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    public Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_box);
        textView.setText(R.string.admin);
        textView.setTextColor(mContext.getColor(R.color.colorAccent));
        textView.setBackgroundColor(mContext.getColor(R.color.colorPrimary));
    }
}