package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        getSupportActionBar().hide();
    }

    public void toq10(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q9checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q9checkBox2);

        if (c1.isChecked()) {
            editor.putInt("SocietyYes", sharedPreferences.getInt("SocietyYes", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("SocietyNo", sharedPreferences.getInt("SocietyNo", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question10.this, Happy.class);
        startActivity(i);
    }
}
