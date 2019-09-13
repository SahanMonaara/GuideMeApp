package com.example.sahan.guideme;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class LaunchActivity extends AppCompatActivity {
    TextView appName;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        appName = findViewById(R.id.appName);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/DroidSans.ttf");

        appName.setTypeface(custom_font);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchActivity.this,MapsActivity.class);
                startActivity(intent);
                finish();
            }

        },2000);
    }
}
