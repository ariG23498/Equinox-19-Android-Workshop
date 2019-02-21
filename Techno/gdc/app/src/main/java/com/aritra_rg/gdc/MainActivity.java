package com.aritra_rg.gdc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean swi = false;
    public void clickFun(View view){
    ImageView img = findViewById(R.id.bart);


    if(swi == false){
        img.animate().translationXBy(-1000).setDuration(1000);
        swi = true;
    }
    else{
        img.animate().translationXBy(1000).setDuration(1000);
        swi = false;
    }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
