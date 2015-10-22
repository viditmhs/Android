package com.game.WordGuess;

/**
 * Explanation:
 *      Phase1: In this game you will get some chances to guess the word.
 *      Phase2: Based on the complexity of word you will score.
 *
 * Created By:
 *      Vidit Maheshwari
 *      No copyright
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WordGuessGame extends Activity {

    private Button button_Start;
    private Button button_End;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button_Start = (Button)findViewById(R.id.start);
        button_End   = (Button)findViewById(R.id.end);

        button_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startGame = new Intent(getApplicationContext(), MainGame.class);
                startActivity(startGame);
                finish();
            }
        });

        button_End.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
