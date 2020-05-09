package com.glowingsoft.driver_app.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.glowingsoft.driver_app.R;

public class EnterOTPActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_o_t_p);
        context = this;
        getViews();

        etEnterOTP.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etEnterOTP.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    tvEnterOTP.setTextColor(getResources().getColor(R.color.et_title_black));

                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etEnterOTP.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    tvEnterOTP.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoActivity(ResetPasswordActivity.class);
                finish();
            }
        });
        tvResendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Code Sent", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void getViews() {
        etEnterOTP = findViewById(R.id.etEnterOTP);
        btnContinue = findViewById(R.id.btnContinue);
        tvResendOTP = findViewById(R.id.tvResendOTP);
        tvEnterOTP = findViewById(R.id.tvEnterOTP);

    }
}
