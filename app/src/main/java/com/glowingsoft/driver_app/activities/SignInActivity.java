package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;

import com.glowingsoft.driver_app.R;

public class SignInActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
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
        etPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etPassword.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivEye.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvPassword.setTextColor(getResources().getColor(R.color.et_title_black));
                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etPassword.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivEye.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvPassword.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(ForgotPasswordActivity.class);

            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(SignUpActivity.class);
            }
        });
        ivEye.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_UP:
                        etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        etPassword.setSelection(etPassword.getText().length());
                        break;

                    case MotionEvent.ACTION_DOWN:
                        etPassword.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;

                }
                return true;
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(HomeActivity.class);
                finish();
            }
        });
    }


    public void getViews() {
        etSchoolKey = findViewById(R.id.etSchoolKey);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        ivKey = findViewById(R.id.ivKey);
        ivEye = findViewById(R.id.ivEye);
        ivPhone = findViewById(R.id.ivPhone);
        tvSchoolKey = findViewById(R.id.tvSchoolKey);
        tvPhone = findViewById(R.id.tvPhone);
        tvPassword = findViewById(R.id.tvPassword);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvSignUp = findViewById(R.id.tvSignUp);
        btnSignIn = findViewById(R.id.btnSignIn);

    }
}
