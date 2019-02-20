package com.aritra_rg.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // 0 :yellow 1 :red  2 :empty
    int activePlayer = 0;


    boolean hasNotEnd= true;

    int[] gameState = {2,2,2,2,2,2,2,2,2};

    int [][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6},{0,3,6},{1,4,7},{2,5,8},};

    int c=0;
    public void dropIn(View view){
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());


        if(gameState[tappedCounter] == 2 && hasNotEnd){



            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1500);

            if(activePlayer == 0){
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            }
            else{
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }


            counter.animate().translationYBy(1500).rotation(3600).setDuration(500);

            for(int index =0; index <9;index++){
                if(gameState[index] != 2){
                    ++c;
                }
            }

            if(c == 9){

                c=0;

                hasNotEnd = false;

                Button btn = findViewById(R.id.button);

                btn.setVisibility(View.VISIBLE);

            }
            else{

                c=0;

            }


            for(int[] winningPosition : winningPositions){
                if(gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]] != 2){

                    String winner="";

                    if(activePlayer == 1){
                        winner = "YELLOW";
                    }
                    else{
                        winner = "RED";
                    }

//                    Toast.makeText(this,winner+" has won", Toast.LENGTH_SHORT).show();
                    hasNotEnd = false;

                    TextView txt = findViewById(R.id.textView);
                    Button btn = findViewById(R.id.button);

                    txt.setText(winner+" HAS WON");

                    btn.setVisibility(View.VISIBLE);
                    txt.setVisibility(View.VISIBLE);


                }

            }
        }

    }



    public void playAgain(View view){
        TextView txt = findViewById(R.id.textView);
        Button btn = findViewById(R.id.button);

        btn.setVisibility(View.INVISIBLE);
        txt.setVisibility(View.INVISIBLE);

        //loop through the whole grid vie
        GridLayout grid = findViewById(R.id.gridLayout);
        for(int i = 0; i < grid.getChildCount(); i++){
            ImageView child = (ImageView) grid.getChildAt(i);

            //did not use image resource
            child.setImageDrawable(null);

        }
        activePlayer = 0;


        hasNotEnd= true;

        for(int j =0;j<gameState.length;j++){
            gameState[j] = 2;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
