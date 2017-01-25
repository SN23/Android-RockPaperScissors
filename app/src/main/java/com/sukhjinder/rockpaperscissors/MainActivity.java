package com.sukhjinder.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> list = new ArrayList<String>(3);
    private int wins = 0;
    private int losses = 0;
    private int numOfRounds = 0;
    private int ties = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("rock");
        list.add("paper");
        list.add("scissors");
        ImageButton RockButton = (ImageButton) findViewById(R.id.rockButton);
        ImageButton PaperButton = (ImageButton) findViewById(R.id.paperButton);
        ImageButton ScissorsButton = (ImageButton) findViewById(R.id.scissorsButton);
        Button EndButton = (Button) findViewById(R.id.endButton);
        final ImageView comChoice = (ImageView) findViewById(R.id.computerChoice);

/**
 * Action listener for each of the image buttons
 */
        if (RockButton != null) {
            RockButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    numOfRounds++;
                    String computerChoice = list.get(randomNumGenerator());
                    if (computerChoice.equals("rock")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "Tie", Toast.LENGTH_SHORT).show();
                        ties++;
                        comChoice.setImageResource(R.drawable.rock);
                    }

                    if (computerChoice.equals("paper")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "You Win", Toast.LENGTH_SHORT).show();
                        wins++;
                        comChoice.setImageResource(R.drawable.paper);
                    }

                    if (computerChoice.equals("scissors")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "You Lose", Toast.LENGTH_SHORT).show();
                        losses++;
                        comChoice.setImageResource(R.drawable.scissors);

                    }
                }

            });
        }


        if (PaperButton != null) {
            PaperButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numOfRounds++;
                    String computerChoice = list.get(randomNumGenerator());
                    if (computerChoice.equals("rock")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "You Win", Toast.LENGTH_SHORT).show();
                        wins++;
                        comChoice.setImageResource(R.drawable.rock);
                    }

                    if (computerChoice.equals("paper")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "Tie", Toast.LENGTH_SHORT).show();
                        ties++;
                        comChoice.setImageResource(R.drawable.paper);
                    }

                    if (computerChoice.equals("scissors")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "You Lose", Toast.LENGTH_SHORT).show();
                        losses++;
                        comChoice.setImageResource(R.drawable.scissors);
                    }
                }
            });
        }


        if (ScissorsButton != null) {
            ScissorsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numOfRounds++;
                    String computerChoice = list.get(randomNumGenerator());
                    if (computerChoice.equals("rock")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "You Lose", Toast.LENGTH_SHORT).show();
                        losses++;
                        comChoice.setImageResource(R.drawable.rock);
                    }

                    if (computerChoice.equals("paper")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "You Win", Toast.LENGTH_SHORT).show();
                        wins++;
                        comChoice.setImageResource(R.drawable.paper);
                    }

                    if (computerChoice.equals("scissors")) {
                        Toast.makeText(getApplication().getBaseContext(),
                                "Tie", Toast.LENGTH_SHORT).show();
                        ties++;
                        comChoice.setImageResource(R.drawable.scissors);
                    }
                }
            });
        }


        if (EndButton != null) {
            EndButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplication().getBaseContext(), "Wins: " + wins + " | Losses: " + losses + " | Ties:" + ties, Toast.LENGTH_LONG).show();
                }
            });
        }


    }

    //  Generates a number between 1 and 3 for to get Computer Choice
    private int randomNumGenerator() {
        double randomNum = Math.floor((Math.random() * 3));
        return (int) randomNum;
    }
}
