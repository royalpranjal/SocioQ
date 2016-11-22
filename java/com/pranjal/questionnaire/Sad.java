package com.pranjal.questionnaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class Sad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        getSupportActionBar().hide();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                (Sad.this).finishAffinity();
            }
        }, 2000);
    }
}
