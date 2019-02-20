package com.aritra_rg.bartanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    boolean tapped = false;
    public void tap(View view){
        ImageView bart = findViewById(R.id.imageView);
        if(tapped) {
            tapped = false;
            bart.animate().alpha(1).setDuration(2000);
        }
        else{
            tapped = true;
            bart.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
