package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Add 6 points to team A when clicked
     */
    public void addSixPointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 3 points to team A
     */
    public void addThreePointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 2 points to Team A
     */
    public void addTwoPointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add one point to Team A
     */
    public void addOnePointForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * give score to team A
     *
     * @param score
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 6 points to team B when clicked
     */
    public void addSixPointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 3 points to team B
     */
    public void addThreePointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 2 points to Team B
     */
    public void addTwoPointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add one point to Team B
     */
    public void addOnePointForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score of both the teams back to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}