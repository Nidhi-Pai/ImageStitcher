package com.example.android.imagestitcher;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    ConstraintLayout c1;
    Button filter, stitch, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        c1 = (ConstraintLayout)findViewById(R.id.c1);
        c1.setBackgroundColor(Color.BLACK);

        filter = (Button)findViewById(R.id.Filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Main2Activity.this, Filter.class);
                Main2Activity.this.startActivity(myIntent);
            }
        });

        exit = (Button)findViewById(R.id.Exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
