package com.aritra_rg.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void clickFunc(View view){
         TextView inr = findViewById(R.id.inr);
         EditText dollar = findViewById(R.id.dollar);
        String value = dollar.getText().toString();

        if(value == null){
            inr.setText("Enter something");
        }
        else{

            double v = Double.parseDouble(value);
            v *= 80.0;
            inr.setText(String.valueOf(v));
        }
    }
}
