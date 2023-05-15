package com.inhatc.android_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (Item.getItemId()) {
            case ID_COLOR_RED:
                objTxtView.setTextColor(Color.RED);
                return true;

        }
    }
}