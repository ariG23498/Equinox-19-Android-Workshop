package com.aritra_rg.tickyboi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // 0 : red    1: yellow    2:empty
    int active = 0;

    boolean hasNotEnd= true;

    int[] gameState = {2,2,2,2,2,2,2,2,2};

    int [][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6},{0,3,6},{1,4,7},{2,5,8},};


    public void clickFunc(View view){
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        Log.i("Counter",counter.getTag().toString());

        gameState[tappedCounter] = active;

        if(active == 0){
            counter.setImageResource(R.drawable.red);
            active = 1;
        }
        else if(active == 1){
            counter.setImageResource(R.drawable.yellow);
            active = 0;
        }


        for(int[] winningPosition : winningPositions){
            if(gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]] != 2){

                String winner="";

                if(active == 0){
                    winner = "YELLOW";
                }
                else{
                    winner = "RED";
                }
                 Toast.makeText(this,winner+" has won", Toast.LENGTH_SHORT).show();
                hasNotEnd = false;

            }

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
