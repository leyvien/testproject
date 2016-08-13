package com.example.x_x.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("vien","test commit change");
        tvtest = (TextView)findViewById(R.id.tvtest);
        tvtest.setText("Hello Git");
    }
}
