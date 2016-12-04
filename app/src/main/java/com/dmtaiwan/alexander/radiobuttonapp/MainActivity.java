package com.dmtaiwan.alexander.radiobuttonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button scoreButton;
    private RadioButton correctButton;
    private RadioButton incorrectOne;
    private RadioButton incorrectTwo;
    private RadioButton incorrectThree;
    private TextView scoreView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the score text view
        scoreView = (TextView) findViewById(R.id.score_text_view);

        //get references to radio buttons
        correctButton = (RadioButton) findViewById(R.id.correct_answer);
        incorrectOne = (RadioButton) findViewById(R.id.incorrect_one);
        incorrectTwo = (RadioButton) findViewById(R.id.incorrect_two);
        incorrectThree = (RadioButton) findViewById(R.id.incorrect_three);

        scoreButton = (Button) findViewById(R.id.score_button);
        scoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if the correct button has been selected, if not, then set score to zero
                if (correctButton.isChecked()) {
                    scoreView.setText("1");
                }else  scoreView.setText("0");
            }
        });

    }
}
