package com.Roshiappstudio.batterrycharging.Avtivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.Roshiappstudio.batterrycharging.R;

public class playAnimation extends AppCompatActivity {

LottieAnimationView lotti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_animation);

        int animPath=getIntent().getIntExtra("key_anim",0);
        lotti=findViewById(R.id.lottieanimation);
        lotti.setAnimation(animPath);
        lotti.setRepeatCount(100);
        lotti.getRepeatCount();
        lotti.playAnimation();




    }
}