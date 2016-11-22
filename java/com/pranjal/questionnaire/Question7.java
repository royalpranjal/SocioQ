package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        getSupportActionBar().hide();
    }

    public void toq8(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q7checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q7checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.q7checkBox3);
        CheckBox c4 = (CheckBox) findViewById(R.id.q7checkBox4);

        if (c1.isChecked()) {
            editor.putInt("Physical", sharedPreferences.getInt("Physical", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("Emotional", sharedPreferences.getInt("Emotional", 0) + 1);
        }
        if (c3.isChecked()) {
            editor.putInt("SocialStatus", sharedPreferences.getInt("SocialStatus", 0) + 1);
        }
        if (c4.isChecked()){
            editor.putInt("StartFamily", sharedPreferences.getInt("StartFamily", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question7.this, Question8.class);
        startActivity(i);
    }
}
