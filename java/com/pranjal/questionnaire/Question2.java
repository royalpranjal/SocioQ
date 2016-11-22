package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        getSupportActionBar().hide();
    }

    public void toq3(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q2checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q2checkBox2);
        if (c1.isChecked()) {
            editor.putInt("AgeLessThan30", sharedPreferences.getInt("AgeLessThan30", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("AgeLessThan30", sharedPreferences.getInt("AgeLessThan30", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question2.this, Question3.class);
        startActivity(i);
    }
}

