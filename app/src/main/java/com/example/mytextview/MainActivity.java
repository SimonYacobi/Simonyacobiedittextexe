package com.example.mytextview;

import static com.example.mytextview.R.id.textview2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textview2);
        tv.setTextSize(200);
        tv.setTextColor(Color.BLUE);
        tv.setText("simon");




    }

    public void go(View view) {
    }
}