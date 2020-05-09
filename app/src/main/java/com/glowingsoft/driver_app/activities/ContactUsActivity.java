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

public class ContactUsActivity extends BaseActivity {

    Button btnSend;
    Button btnBack;
    EditText etEmail, etMessage;
    ImageView ivEmail;
    TextView tvEmail, tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        getViews();

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
        etMessage.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundResource(R.drawable.focus_border_style);
                    etMessage.setTextColor(getResources().getColor(R.color.et_text_color_blue));
                    tvMessage.setTextColor(getResources().getColor(R.color.et_title_black));

                } else {
                    v.setBackgroundResource(R.drawable.focus_lost_border_style);
                    etMessage.setTextColor(getResources().getColor(R.color.et_text_color_gray));
                    tvMessage.setTextColor(getResources().getColor(R.color.et_title_gray));

                }
            }
        });


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactUsActivity.this, "Email Sent", Toast.LENGTH_SHORT).show();
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
        btnSend = findViewById(R.id.btnSend);
        btnBack = findViewById(R.id.btnBack);
        etEmail = findViewById(R.id.etEmail);
        etMessage = findViewById(R.id.etMessage);
        ivEmail = findViewById(R.id.ivEmail);
        tvEmail = findViewById(R.id.tvEmail);
        tvMessage = findViewById(R.id.tvMessage);
    }
}
