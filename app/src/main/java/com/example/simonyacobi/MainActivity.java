package com.example.simonyacobi;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfirstapp.R;


public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btn);
        tv= findViewById(R.id.tv);

    }

    public void go(View view) {

    }


}