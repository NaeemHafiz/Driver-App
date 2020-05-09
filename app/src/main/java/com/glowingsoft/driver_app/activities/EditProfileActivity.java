package com.glowingsoft.driver_app.activities;

import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.glowingsoft.driver_app.R;


public class EditProfileActivity extends BaseActivity {

    Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        getViews();

        etUserName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etUserName.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivUser.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvName.setTextColor(getResources().getColor(R.color.et_title_black));

                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etUserName.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivUser.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvName.setTextColor(getResources().getColor(R.color.et_title_gray));

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
        etEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etEmail.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivEmail.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvEmail.setTextColor(getResources().getColor(R.color.et_title_black));

                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etEmail.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivEmail.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvEmail.setTextColor(getResources().getColor(R.color.et_title_gray));


                }
            }
        });
//        etPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus) {
//                    v.setBackgroundResource(R.drawable.focus_border_style);
//                    etPassword.setTextColor(getResources().getColor(R.color.et_text_color_blue));
//                    ivEye.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
//                    tvPassword.setTextColor(getResources().getColor(R.color.et_title_black));
//
//                } else {
//                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
//                    etPassword.setTextColor(getResources().getColor(R.color.et_text_color_gray));
//                    ivEye.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
//                    tvPassword.setTextColor(getResources().getColor(R.color.et_title_gray));
//
//                }
//            }
//        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Profile updated successfully", Toast.LENGTH_SHORT).show();
                finish();
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

        flProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditProfileActivity.this, "Uplaod Image", Toast.LENGTH_SHORT).show();
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ivProfile.setClipToOutline(true);
        }
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public void getViews() {
        etUserName = findViewById(R.id.etUserName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        tvName = findViewById(R.id.tvName);
        etPassword = findViewById(R.id.etPassword);
        tvPassword = findViewById(R.id.tvPassword);
        tvEmail = findViewById(R.id.tvEmail);
        ivKey = findViewById(R.id.ivKey);
        ivEye = findViewById(R.id.ivEye);
        ivPhone = findViewById(R.id.ivPhone);
        tvSchoolKey = findViewById(R.id.tvSchoolKey);
        ivEmail = findViewById(R.id.ivEmail);
        tvPhone = findViewById(R.id.tvPhone);
        btnUpdate = findViewById(R.id.btnUpdate);
        ivUser = findViewById(R.id.ivUser);
        ivProfile = findViewById(R.id.ivProfile);
        flProfile = findViewById(R.id.flProfile);
        btnBack = findViewById(R.id.btnBack);

    }
}
