package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.view.View;

import com.glowingsoft.driver_app.R;

public class ForgotPasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        context = this;
        getViews();
        etSchoolKey.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etSchoolKey.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivKey.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvSchoolKey.setTextColor(getResources().getColor(R.color.et_title_black));

                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etSchoolKey.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivKey.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvSchoolKey.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });
        etPhone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etPhone.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivPhone.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvPhone.setTextColor(getResources().getColor(R.color.et_title_black));

                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etPhone.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivPhone.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvPhone.setTextColor(getResources().getColor(R.color.et_title_gray));


                }
            }
        });

        btnGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(EnterOTPActivity.class);
                finish();
            }
        });
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(SignInActivity.class);
                finish();
            }
        });
    }


    public void getViews() {
        etSchoolKey = findViewById(R.id.etSchoolKey);
        etPhone = findViewById(R.id.etPhone);
        ivPhone = findViewById(R.id.ivPhone);
        tvSchoolKey = findViewById(R.id.tvSchoolKey);
        tvPhone = findViewById(R.id.tvPhone);
        tvSignIn = findViewById(R.id.tvSignIn);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnGetOTP = findViewById(R.id.btnGetOTP);
        ivKey = findViewById(R.id.ivKey);

    }
}
