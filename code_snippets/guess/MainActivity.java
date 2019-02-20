package com.aritra_rg.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int result = random.nextInt(20);

    public void func(View view){
        EditText edtTxt = findViewById(R.id.edtTxt);
        TextView Txt = findViewById(R.id.Txt);
        int v =Integer.parseInt(edtTxt.getText().toString());
        if(v == result){
            Txt.setText("Guessed it right");
        }
        else if(v < result){
            Txt.setText("Go higher");
        }
        else{
            Txt.setText("Go lower");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
