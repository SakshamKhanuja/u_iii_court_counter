package com.basic.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * The app shows the points scored by two teams in basketball.
 */
public class MainActivity extends AppCompatActivity {

    /*
     * Stores Team A score.
     */
    private int scoreTeamA = 0;

    /*
     * Stores Team B score.
     */
    private int scoreTeamB = 0;

    /*
     * Shows the team A score.
     */
    private TextView scoreTeamATextView;

    /*
     * Shows the team B score.
     */
    private TextView scoreTeamBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding both TextViews that will show scores of Team A and Team B.
        scoreTeamATextView = findViewById(R.id.score_team_A);
        scoreTeamBTextView = findViewById(R.id.score_team_B);
    }

    /**
     * Increases Team A score by 3 points.
     *
     * @param view is the clicked "+3 POINTS" Button under Team A Layout.
     */
    public void threePointsTeamA(View view) {
        scoreTeamA += 3;
        displayTeamAScore();
    }

    /**
     * Increases Team A score by 2 points.
     *
     * @param view is the clicked "+2 POINTS" Button under Team A Layout.
     */
    public void twoPointsTeamA(View view) {
        scoreTeamA += 2;
        displayTeamAScore();
    }

    /**
     * Increases Team A score by 1 point.
     *
     * @param view is the clicked "FREE THROW" Button under Team A Layout.
     */
    public void freeThrowTeamA(View view) {
        scoreTeamA++;
        displayTeamAScore();
    }

    /**
     * Increases Team B score by 3 points.
     *
     * @param view is the clicked "+3 POINTS" Button under Team B Layout.
     */
    public void threePointsTeamB(View view) {
        scoreTeamB += 3;
        displayTeamBScore();
    }

    /**
     * Increases Team B score by 2 points.
     *
     * @param view is the clicked "+2 POINTS" Button under Team B Layout.
     */
    public void twoPointsTeamB(View view) {
        scoreTeamB += 2;
        displayTeamBScore();
    }

    /**
     * Increases Team B score by 1 point.
     *
     * @param view is the clicked "FREE THROW" Button under Team B Layout.
     */
    public void freeThrowTeamB(View view) {
        scoreTeamB++;
        displayTeamBScore();
    }

    /**
     * Sets the score of Team A.
     */
    private void displayTeamAScore() {
        scoreTeamATextView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Sets the score of Team B.
     */
    private void displayTeamBScore() {
        scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Resets the game.
     *
     * @param view is the clicked "Reset" Button.
     */
    public void resetScore(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayTeamAScore();
        displayTeamBScore();
    }
}