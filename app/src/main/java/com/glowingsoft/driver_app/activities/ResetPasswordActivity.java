package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.glowingsoft.driver_app.R;

public class ResetPasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        context = this;
        getViews();
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
        etPasswordConfirm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etPasswordConfirm.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivEyeConfirm.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvPasswordConfirm.setTextColor(getResources().getColor(R.color.et_title_black));
                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etPasswordConfirm.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivEyeConfirm.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvPasswordConfirm.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
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
        ivEyeConfirm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_UP:
                        etPasswordConfirm.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        etPasswordConfirm.setSelection(etPassword.getText().length());
                        break;

                    case MotionEvent.ACTION_DOWN:
                        etPasswordConfirm.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;

                }
                return true;
            }
        });
        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(HomeActivity.class);
                Toast.makeText(context, "Password Reset Successfully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }


    public void getViews() {
        btnResetPassword = findViewById(R.id.btnResetPassword);
        ivEye = findViewById(R.id.ivEye);
        ivEyeConfirm = findViewById(R.id.ivEyeConfirm);
        tvPassword = findViewById(R.id.tvPassword);
        tvPasswordConfirm = findViewById(R.id.tvPasswordConfirm);
        etPassword = findViewById(R.id.etPassword);
        etPasswordConfirm = findViewById(R.id.etPasswordConfirm);

    }
}
