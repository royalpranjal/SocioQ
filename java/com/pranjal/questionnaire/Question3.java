package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        getSupportActionBar().hide();
    }

    public void toq4(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q3checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q3checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.q3checkBox3);
        if (c1.isChecked()) {
            editor.putInt("LiveIn", sharedPreferences.getInt("LiveIn", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("LongDistance", sharedPreferences.getInt("LongDistance", 0) + 1);
        }
        if (c3.isChecked()) {
            editor.putInt("Married", sharedPreferences.getInt("Married", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question3.this, Question4.class);
        startActivity(i);
    }
}
