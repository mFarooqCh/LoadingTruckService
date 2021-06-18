package com.example.truckloadingone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

//third party libs for splash screen
import android.os.Handler;
import android.os.Looper;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //hide status bar and make activity full screen
        getWindow().addFlags(
                FLAG_FULLSCREEN);

        Intent newIntent = new Intent(this, MainActivity.class);

        //jump to activity after delay of 5 seconds
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> startActivity(newIntent), 5000);
    }
}