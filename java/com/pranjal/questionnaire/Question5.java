package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        getSupportActionBar().hide();
    }

    public void toq6(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q5checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q5checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.q5checkBox3);
        CheckBox c4 = (CheckBox) findViewById(R.id.q5checkBox4);

        if (c1.isChecked()) {
            editor.putInt("Family", sharedPreferences.getInt("Family", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("Friends", sharedPreferences.getInt("Friends", 0) + 1);
        }
        if (c3.isChecked()) {
            editor.putInt("SocialMedia", sharedPreferences.getInt("SocialMedia", 0) + 1);
        }
        if (c4.isChecked()) {
            editor.putInt("Event", sharedPreferences.getInt("Event", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question5.this, Question6.class);
        startActivity(i);
    }

}

