package com.sukhjinder.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String rock = "rock";
    String paper = "paper";
    String scissors = "scissors";
    int userWins = 0;
    int userLosses = 0;
    int computerWins = 0;
    int computerLosses = 0;
    int numOfRounds = 0;
    int ties = 0;
    ArrayList<String> list = new ArrayList<String>(3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        list.add(rock);
        list.add(paper);
        list.add(scissors);
        ImageButton RockButton = (ImageButton) findViewById(R.id.rockButton);
        ImageButton PaperButton = (ImageButton) findViewById(R.id.paperButton);
        ImageButton ScissorsButton = (ImageButton) findViewById(R.id.scissorsButton);


        RockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String computerChoice = list.get(randomNumGenerator());
                if(computerChoice.equals("rock"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "Tie", Toast.LENGTH_SHORT).show();
                }

                if(computerChoice.equals("paper"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "You Win", Toast.LENGTH_SHORT).show();
                }

                if(computerChoice.equals("scissors"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "You Lose", Toast.LENGTH_SHORT).show();
                }
            }
        });



        PaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String computerChoice = list.get(randomNumGenerator());
                if(computerChoice.equals("rock"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "You Win", Toast.LENGTH_SHORT).show();
                }

                if(computerChoice.equals("paper"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "Tie", Toast.LENGTH_SHORT).show();
                }

                if(computerChoice.equals("scissors"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "You Lose", Toast.LENGTH_SHORT).show();
                }
            }
        });



        ScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String computerChoice = list.get(randomNumGenerator());
                if(computerChoice.equals("rock"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "You Lose", Toast.LENGTH_SHORT).show();
                }

                if(computerChoice.equals("paper"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "You Win", Toast.LENGTH_SHORT).show();
                }

                if(computerChoice.equals("scissors"))
                {
                    Toast.makeText(getApplication().getBaseContext(),
                            "Tie", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//  Generates a number between 1 and 3 for to get Computer Choice
    private int randomNumGenerator()
    {
        double randomNum = Math.floor((Math.random() * 3));
        return (int)randomNum;
    }
}
