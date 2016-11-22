package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class SurveyYesNo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_yes_no);
        getSupportActionBar().hide();
    }

    public void tos(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        CheckBox c1 = (CheckBox) findViewById(R.id.scheckBox1);
        if(c1.isChecked()){
            editor.putInt("SurveyYes", sharedPreferences.getInt("SurveyYes", 0) + 1);
            editor.commit();
            Intent i = new Intent(SurveyYesNo.this, PersonalYesNo.class);
            startActivity(i);
        }
        else{
            editor.putInt("SurveyNo", sharedPreferences.getInt("SurveyNo", 0) + 1);
            editor.commit();

            Intent i = new Intent(SurveyYesNo.this, Sad.class);
            startActivity(i);
        }
    }
}
