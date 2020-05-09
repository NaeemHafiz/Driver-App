package com.glowingsoft.driver_app.activities.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.glowingsoft.driver_app.R;
import com.glowingsoft.driver_app.adapters.ScheduleAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment implements ScheduleAdapter.ClickListener {

    private RecyclerView rv_schedule;
    private ScheduleAdapter scheduleAdapter;

    public ScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_schedule, container, false);
        rv_schedule = root.findViewById(R.id.rv_schedule);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv_schedule.setLayoutManager(manager);
        rv_schedule.setHasFixedSize(true);

        scheduleAdapter = new ScheduleAdapter();
        scheduleAdapter.setClickListener(this);
        rv_schedule.setAdapter(scheduleAdapter);
        return root;
    }

    @Override
    public void onRecyclerViewItemClicked(int position) {
        Toast.makeText(getActivity(), "helo i am Schedule Fragment", Toast.LENGTH_SHORT).show();

    }
}
