package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.glowingsoft.driver_app.R;

public class PrivacyPolicyActivity extends BaseActivity {

    TextView tvTitle;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        getViews();

        String activity_title = getIntent().getStringExtra("title");
        tvTitle.setText(activity_title + "");


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void getViews() {
        btnBack = findViewById(R.id.btnBack);
        tvTitle = findViewById(R.id.tvTitle);

    }
}
