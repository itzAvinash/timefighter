package com.example.timefighter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    int score=0;
    TextView playerScoreLable;
    TextView timeleftscore;
    Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerScoreLable = (TextView)findViewById(R.id.ScoreTextVIew);
         timeleftscore =(TextView)findViewById(R.id.TimeLeftTextView);
        Button bt =(Button)findViewById(R.id.tapme_button);
       bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        incrementScore();


    }

    private void incrementScore() {
        score++;
        playerScoreLable.setText(score);
    }
}
