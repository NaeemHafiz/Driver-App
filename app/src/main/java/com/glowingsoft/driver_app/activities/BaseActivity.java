package com.glowingsoft.driver_app.activities;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    protected ProgressBar mPb;
    Context context;
    Intent intent;
    AlertDialog internetAlert;
    Timer timer;

    EditText etSchoolKey, etPhone, etPassword, etUserName, etEnterOTP, etPasswordConfirm, etEmail;
    ImageView ivKey, ivEye, ivPhone, ivEyeConfirm, ivUser, ivProfile, ivEmail;
    FrameLayout flProfile;

    TextView tvSchoolKey, tvPhone, tvPassword, tvForgotPassword, tvSignUp, tvSignIn, tvResendOTP, tvPasswordConfirm, tvName, tvEnterOTP, tvEmail;
    Button btnSignUp, btnSignIn, btnGetOTP, btnContinue, btnResetPassword, btnBack;

    @Override
    public void onClick(View v) {

    }


    //region Util Functions
    protected void gotoActivity(Class activity) {
        intent = new Intent(context, activity);
        startActivity(intent);
    }

    protected void showInterntConnectDialog() {
        mPb.setVisibility(View.INVISIBLE);
        internetAlert.dismiss();
        internetAlert.show();
    }
}
