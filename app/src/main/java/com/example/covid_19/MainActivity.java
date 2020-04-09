package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button Shop,User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Shop = findViewById(R.id.button);
        User = findViewById(R.id.button2);

        final ImageView virusImage = findViewById(R.id.imageView7);

        Shop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,Shopkeeper.class);
                        startActivity(i);
                    }
                }
        );
        User.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent I = new Intent(MainActivity.this,User.class);
                        startActivity(I);
                    }
                }
        );

    }
}
