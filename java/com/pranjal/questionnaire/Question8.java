package com.pranjal.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        getSupportActionBar().hide();
    }

    public void toq9(final View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("SocioData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        CheckBox c1 = (CheckBox) findViewById(R.id.q8checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.q8checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.q8checkBox3);
        CheckBox c4 = (CheckBox) findViewById(R.id.q8checkBox4);

        if (c1.isChecked()) {
            editor.putInt("MeetingFriendsFamily", sharedPreferences.getInt("MeetingFriendsFamily", 0) + 1);
        }
        if (c2.isChecked()) {
            editor.putInt("GettingPhysical", sharedPreferences.getInt("GettingPhysical", 0) + 1);
        }
        if (c3.isChecked()) {
            editor.putInt("MesmerizingMoment", sharedPreferences.getInt("MesmerizingMoment", 0) + 1);
        }
        if (c4.isChecked()) {
            editor.putInt("SocialStatus", sharedPreferences.getInt("SocialStatus", 0) + 1);
        }
        editor.commit();
        Intent i = new Intent(Question8.this, Question10.class);
        startActivity(i);
    }
}
