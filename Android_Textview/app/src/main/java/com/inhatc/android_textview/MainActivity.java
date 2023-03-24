package com.inhatc.android_textview;

import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView objTV = new TextView(this);
        objTV.setText("Android Programming !");
        objTV.setTextColor(Color.parseColor("#FF0000FF"));
        objTV.setTextSize(Dimension.SP, 32);
        objTV.setGravity(Gravity.CENTER);
        setContentView(objTV);
    }
}