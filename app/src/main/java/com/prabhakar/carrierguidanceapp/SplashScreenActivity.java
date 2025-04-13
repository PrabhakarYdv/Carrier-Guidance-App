package com.prabhakar.carrierguidanceapp;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView logoImageView;
    FirebaseAuth firebaseAuth;

    @SuppressLint("ObjectAnimatorBinding")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logoImageView = findViewById(R.id.logoImageView);
        firebaseAuth=FirebaseAuth.getInstance();

        ObjectAnimator tasselAnimator = ObjectAnimator.ofFloat(logoImageView, "rotation", -15f, 15f);
        tasselAnimator.setRepeatCount(ObjectAnimator.INFINITE); // Repeat forever

        tasselAnimator.setDuration(1000); // Duration for one swing

        tasselAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        tasselAnimator.start();

        new Handler().postDelayed(() -> {
            if (firebaseAuth.getCurrentUser()!=null){
                startActivity(new Intent(this, MainActivity.class));
                finish();
            }
            else {
                startActivity(new Intent(this, LoginActivity.class));
                finish();
            }
        }, 2000);
    }
}