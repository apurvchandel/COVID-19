package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class Start_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_);

        ImageView background = findViewById(R.id.backgroundImageView);
        final ImageView virus = findViewById(R.id.virusImageView);

        AnimatorSet virusAnimation = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.start_virus_animator);
        virusAnimation.setTarget(virus);
        virusAnimation.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                virus.setImageResource(R.drawable.shield);
                new CountDownTimer(1000, 500) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {
                        startActivity(new Intent(Start_Activity.this, MainActivity.class));
                    }
                }.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        virusAnimation.start();
    }
}
