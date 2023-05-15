package com.inhatc.android_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DogActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        btnOK = (Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
    }

    public void onClick(View v){
        if (v == btnOK){
            finish();
        }
    }
}