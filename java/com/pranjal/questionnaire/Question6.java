package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        getSupportActionBar().hide();
    }

    public void toq7(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q6checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q6checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.q6checkBox3);

        if (c1.isChecked()) {
            editor.putInt("Phone", sharedPreferences.getInt("Phone", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("Letter", sharedPreferences.getInt("Letter", 0) + 1);
        }
        if (c3.isChecked()) {
            editor.putInt("inperson", sharedPreferences.getInt("inperson", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question6.this, Question7.class);
        startActivity(i);
    }
}
