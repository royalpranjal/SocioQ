package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        getSupportActionBar().hide();
    }

    public void toq2(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.q1checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q1checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.q1checkBox3);
        if(c1.isChecked()){
            editor.putInt("Male", sharedPreferences.getInt("Male", 0) + 1);
        }
        if(c2.isChecked()){
            editor.putInt("Female", sharedPreferences.getInt("Female", 0) + 1);
        }
        if(c3.isChecked()){
            editor.putInt("NA", sharedPreferences.getInt("NA", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question1.this, Question2.class);
        startActivity(i);
    }

}
