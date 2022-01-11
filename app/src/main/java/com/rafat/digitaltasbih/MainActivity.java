package com.rafat.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button reset,count;
    int ct=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        reset = findViewById(R.id.reset);
        count = findViewById(R.id.count);

        //count event are called here
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ct++;
                tvCount.setText(""+ct);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ct=0;
            tvCount.setText(""+ct);
            }
        });





    }
}