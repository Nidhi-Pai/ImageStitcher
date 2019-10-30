package com.example.android.imagestitcher;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Filter extends AppCompatActivity{
    ConstraintLayout c3;
    Button b1, b2, b3, b4, b5, b6, load;
    ImageView im;

    private Bitmap bmp;
    private Bitmap operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter_screen);

        c3 = (ConstraintLayout)findViewById(R.id.c3);
        c3.setBackgroundColor(Color.BLACK);

        im = (ImageView) findViewById(R.id.img);

        BitmapDrawable abmp = (BitmapDrawable) im.getDrawable();
        bmp = abmp.getBitmap();

        b1 = (Button)findViewById(R.id.red);
        b2 = (Button)findViewById(R.id.green);
        b3 = (Button)findViewById(R.id.blue);
        b4 = (Button)findViewById(R.id.bright);
        b5 = (Button)findViewById(R.id.dark);
        b6 = (Button)findViewById(R.id.back);
        load = (Button)findViewById(R.id.load);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(),bmp.getConfig());

                for(int i=0; i<bmp.getWidth(); i++){
                    for(int j=0; j<bmp.getHeight(); j++){
                        int p = bmp.getPixel(i, j);
                        int r = Color.red(p);
                        int g = Color.green(p);
                        int b = Color.blue(p);
                        int alpha = Color.alpha(p);

                        r =  r + 150;
                        g =  0;
                        b =  0;
                        alpha = 0;
                        operation.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
                    }
                }
                im.setImageBitmap(operation);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(), bmp.getConfig());

                for(int i=0; i<bmp.getWidth(); i++){
                    for(int j=0; j<bmp.getHeight(); j++){
                        int p = bmp.getPixel(i, j);
                        int r = Color.red(p);
                        int g = Color.green(p);
                        int b = Color.blue(p);
                        int alpha = Color.alpha(p);

                        r =  0;
                        g =  g+150;
                        b =  0;
                        alpha = 0;
                        operation.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
                    }
                }
                im.setImageBitmap(operation);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(), bmp.getConfig());

                for(int i=0; i<bmp.getWidth(); i++){
                    for(int j=0; j<bmp.getHeight(); j++){
                        int p = bmp.getPixel(i, j);
                        int r = Color.red(p);
                        int g = Color.green(p);
                        int b = Color.blue(p);
                        int alpha = Color.alpha(p);

                        r =  0;
                        g =  0;
                        b =  b+150;
                        alpha = 0;
                        operation.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
                    }
                }
                im.setImageBitmap(operation);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation= Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(),bmp.getConfig());

                for(int i=0; i<bmp.getWidth(); i++){
                    for(int j=0; j<bmp.getHeight(); j++){
                        int p = bmp.getPixel(i, j);
                        int r = Color.red(p);
                        int g = Color.green(p);
                        int b = Color.blue(p);
                        int alpha = Color.alpha(p);

                        r = 100  +  r;
                        g = 100  + g;
                        b = 100  + b;
                        alpha = 100 + alpha;
                        operation.setPixel(i, j, Color.argb(alpha, r, g, b));
                    }
                }
                im.setImageBitmap(operation);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation= Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(),bmp.getConfig());

                for(int i=0; i<bmp.getWidth(); i++){
                    for(int j=0; j<bmp.getHeight(); j++){
                        int p = bmp.getPixel(i, j);
                        int r = Color.red(p);
                        int g = Color.green(p);
                        int b = Color.blue(p);
                        int alpha = Color.alpha(p);

                        r =  r - 50;
                        g =  g - 50;
                        b =  b - 50;
                        alpha = alpha -50;
                        operation.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
                    }
                }
                im.setImageBitmap(operation);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Filter.this, Main2Activity.class);
                startActivity(intent);
            }
        });



    }
}
