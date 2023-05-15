package com.inhatc.android_alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ToggleButton objTGButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objTGButton = (ToggleButton) findViewById(R.id.tgbtnSwitch);
        objTGButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        showDialog(0);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        super.onCreateDialog(id);

        AlertDialog digAlert;

        digAlert = new AlertDialog.Builder(this)
                .setIcon(R.drawable.question)
                .setTitle("알림!")
                .setMessage("통화시간 3분 초과!")
                .setView(null)
                .setPositiveButton("확인(ok)", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
        }).create();
        return digAlert;
    }
}