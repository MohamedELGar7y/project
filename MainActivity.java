package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int goala=0;
    int goalb=0;
    public void bot1(View v) {
        goala = goala+3;
        displayForTeamA(goala);
    }
    public void bot2(View v) {
        goala = goala+2;
        displayForTeamA(goala);
    }
    public void bot3(View v) {
        goala = goala+1;
        displayForTeamA(goala);
    }
    public void botm1(View v) {
        goalb = goalb+3;
        displayForTeamB(goalb);
    }
    public void botm2(View v) {
        goalb = goalb+2;
        displayForTeamB(goalb);
    }
    public void botm3(View v) {
        goalb = goalb+1;
        displayForTeamB(goalb);
    }
    public void restScore(View v){
       goala=0;
       goalb=0;
        displayForTeamA(goala);
        displayForTeamB(goalb);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
