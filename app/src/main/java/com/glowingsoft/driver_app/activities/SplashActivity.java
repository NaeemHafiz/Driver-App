package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.view.WindowManager;

import com.glowingsoft.driver_app.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        context = this;
        setContentView(R.layout.activity_splash);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                gotoActivity(SignInActivity.class);
                finish();
            }
        }, 2000);
    }
}
