package com.aritra_rg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String LOG_TAG = MainActivity.class.getSimpleName();
    public void clickFunc(View view){
        EditText edt = (EditText) findViewById(R.id.editText);
        String t = edt.getText().toString();
        Log.v(LOG_TAG,t);
        Toast.makeText(this,t,Toast.LENGTH_SHORT).show();
        edt.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
