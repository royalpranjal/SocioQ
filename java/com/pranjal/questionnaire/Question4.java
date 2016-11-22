package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        getSupportActionBar().hide();
    }

    public void toq5(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q4checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q4checkBox2);
        if (c1.isChecked()) {
            editor.putInt("Love", sharedPreferences.getInt("Love", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("Casual", sharedPreferences.getInt("Casual", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question4.this, Question5.class);
        startActivity(i);
    }
}
