package com.glowingsoft.driver_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.glowingsoft.driver_app.R;

public class ChangePasswordActvity extends BaseActivity {

    Button btnChangePassword;
    Button btnBack;
    EditText etOld, etNew, etConfirm;
    ImageView ivold, ivnew, ivconfirm;
    TextView tvPasswordOld, tvPasswordNew, tvPasswordConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_actvity);

        getViews();

        etOld.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etOld.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivold.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvPasswordOld.setTextColor(getResources().getColor(R.color.et_title_black));
                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etOld.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivold.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvPasswordOld.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });
        etNew.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etNew.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivnew.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvPasswordNew.setTextColor(getResources().getColor(R.color.et_title_black));
                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etNew.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivnew.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvPasswordNew.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });
        etConfirm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etConfirm.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    ivconfirm.setColorFilter(getResources().getColor(R.color.et_text_color_blue));
                    tvPasswordConfirm.setTextColor(getResources().getColor(R.color.et_title_black));
                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etConfirm.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    ivconfirm.setColorFilter(getResources().getColor(R.color.et_text_color_gray));
                    tvPasswordConfirm.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });
        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChangePasswordActvity.this, "Password Updated", Toast.LENGTH_SHORT).show();
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
        btnChangePassword = findViewById(R.id.btnChangePassword);
        btnBack = findViewById(R.id.btnBack);
        etOld = findViewById(R.id.etOld);
        etNew = findViewById(R.id.etNew);
        etConfirm = findViewById(R.id.etConfirm);
        ivold = findViewById(R.id.ivold);
        ivnew = findViewById(R.id.ivnew);
        ivconfirm = findViewById(R.id.ivconfirm);
        tvPasswordOld = findViewById(R.id.tvPasswordOld);
        tvPasswordNew = findViewById(R.id.tvPasswordNew);
        tvPasswordConfirm = findViewById(R.id.tvPasswordConfirm);


    }
}
