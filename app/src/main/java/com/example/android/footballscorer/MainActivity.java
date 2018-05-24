package com.example.android.footballscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscorer.R;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Increase the score for Home Team by 1 point.
     */
    public void addOneForHomeTeam(View v) {
        scoreHomeTeam += 1;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Increase the score for Home Team by 2 points.
     */
    public void addTwoForHomeTeam(View v) {
        scoreHomeTeam += 2;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Increase the score for Home Team by 3 points.
     */
    public void addThreeForHomeTeam(View v) {
        scoreHomeTeam += 3;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Increase the score for Home Team by 6 points.
     */
    public void addSixForHomeTeam(View v) {
        scoreHomeTeam += 6;
        displayForHomeTeam(scoreHomeTeam);
    }


    /**
     * Displays the given score for Home Team.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Increase the score for Away Team by 1 point.
     */
    public void addOneForAwayTeam(View v) {
        scoreAwayTeam += 1;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Increase the score for Away Team by 2 points.
     */
    public void addTwoForAwayTeam(View v) {
        scoreAwayTeam += 2;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Increase the score for Away Team  by 3 points.
     */
    public void addThreeForAwayTeam(View v) {
        scoreAwayTeam += 3;
        displayForAwayTeam(scoreAwayTeam);
    }


    /**
     * Increase the score for Away Team  by 6 points.
     */
    public void addSixForAwayTeam(View v) {
        scoreAwayTeam += 6;
        displayForAwayTeam(scoreAwayTeam);
    }



    /**
     * Displays the given score for Away Team.
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets score for both teams to 0.
     */
    public void resetScore(View v) {
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;
        displayForHomeTeam(scoreHomeTeam);
        displayForAwayTeam(scoreAwayTeam);
    }
}