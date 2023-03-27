package com.inhatc.android_tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {
    TabHost myTabHost = null;
    TabHost.TabSpec myTabSpec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTabHost = (TabHost)findViewById(R.id.tabhost);
        myTabHost.setup();

        myTabSpec = (myTabHost).newTabSpec("Artists")
                .setIndicator("Artists")
                .setContent(R.id.tab1);
        myTabHost.addTab(myTabSpec);

        myTabSpec = (myTabHost).newTabSpec("Albums")
                .setIndicator("Albums")
                .setContent(R.id.tab2);
        myTabHost.addTab(myTabSpec);

        myTabSpec = (myTabHost).newTabSpec("Songs")
                .setIndicator("Artists")
                .setContent(R.id.tab3);
        myTabHost.addTab(myTabSpec);

        myTabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("red"));
        myTabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("green"));
        myTabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("blue"));

        for (int i = 0; i < myTabHost.getTabWidget().getChildCount(); ++i){
            myTabHost.getTabWidget().getChildAt(i).getLayoutParams().height=150;
        }

    }
}