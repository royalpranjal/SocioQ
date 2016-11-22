package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class PersonalYesNo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_yes_no);

        getSupportActionBar().hide();
    }

    public void toq(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.pcheckBox1);
        if(c1.isChecked()){
            editor.putInt("PersonalYes", sharedPreferences.getInt("PersonalYes", 0) + 1);
            editor.commit();

            Intent i = new Intent(PersonalYesNo.this, Question1.class);
            startActivity(i);
        }
        else{
            editor.putInt("PersonalNo", sharedPreferences.getInt("PersonalNo", 0) + 1);
            editor.commit();

            Intent i = new Intent(PersonalYesNo.this, Sad.class);
            startActivity(i);
        }
    }
}
