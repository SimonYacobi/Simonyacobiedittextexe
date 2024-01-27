package com.example.simonyacobiexe4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btn);


    }
    public void go(View view) {
        counter++;
        updateButtonText();
        if (counter % 7 == 0) {
            btn.setText("BOOM!");

        }
    }
    private void updateButtonText() {
        btn.setText("This is a click number: " + counter);
    }
}