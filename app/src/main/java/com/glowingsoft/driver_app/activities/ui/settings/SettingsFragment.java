package com.glowingsoft.driver_app.activities.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.glowingsoft.driver_app.R;
import com.glowingsoft.driver_app.activities.AboutActivity;
import com.glowingsoft.driver_app.activities.ChangePasswordActvity;
import com.glowingsoft.driver_app.activities.ContactUsActivity;
import com.glowingsoft.driver_app.activities.SignInActivity;


public class SettingsFragment extends Fragment {
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View root = inflater.inflate(R.layout.fragment_settings, container, false);
//        return root;
//    }

    private LinearLayout llAboutUs, llPrivacy, llTerms, llContact, llRate, llChangePassword, llLogout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        llAboutUs = root.findViewById(R.id.llAboutUs);
        llPrivacy = root.findViewById(R.id.llPrivacy);
        llTerms = root.findViewById(R.id.llTerms);
        llContact = root.findViewById(R.id.llContact);
        llRate = root.findViewById(R.id.llRate);
        llChangePassword = root.findViewById(R.id.llChangePassword);
        llLogout = root.findViewById(R.id.llLogout);

        llAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutActivity.class);
                intent.putExtra("title", "About us");
                startActivity(intent);
            }
        });
        llPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutActivity.class);
                intent.putExtra("title", "Privacy policy");
                startActivity(intent);
            }
        });
        llTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutActivity.class);
                intent.putExtra("title", "Terms & Conditions");
                startActivity(intent);
            }
        });
        llContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ContactUsActivity.class);
                startActivity(intent);
            }
        });
        llRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Rated 5*", Toast.LENGTH_SHORT).show();
            }
        });
        llChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChangePasswordActvity.class);
                startActivity(intent);
            }
        });
        llLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SignInActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return root;
    }
}