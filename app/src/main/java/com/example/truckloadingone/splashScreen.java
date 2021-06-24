package com.example.truckloadingone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

//third party libs for splash screen
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class splashScreen extends AppCompatActivity {

    //variables
    Animation topAnim, bottomAnim;
    ImageView img;
    TextView appName, tagLine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //setting up animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //hooks , means find them in view
        findViewById(R.id.test_image).setAnimation(topAnim);
        findViewById(R.id.appName).setAnimation(bottomAnim);
        findViewById(R.id.tagLine).setAnimation(bottomAnim);;

        //hide status bar and make activity full screen
        getWindow().addFlags(
                FLAG_FULLSCREEN);

        Intent newIntent = new Intent(this, MainActivity.class);

        //jump to activity after delay of 5 seconds
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> startActivity(newIntent), 5000);
    }
}