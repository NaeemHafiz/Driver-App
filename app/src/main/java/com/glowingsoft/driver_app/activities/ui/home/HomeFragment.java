package com.glowingsoft.driver_app.activities.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.glowingsoft.driver_app.R;


public class HomeFragment extends Fragment {

    private LinearLayout ll_route, ll_schedule;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ll_route = root.findViewById(R.id.ll_route);
        ll_schedule = root.findViewById(R.id.ll_schedule);
        ll_route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "i am Route", Toast.LENGTH_SHORT).show();
            }
        });
        ll_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "i am Schedule", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}
