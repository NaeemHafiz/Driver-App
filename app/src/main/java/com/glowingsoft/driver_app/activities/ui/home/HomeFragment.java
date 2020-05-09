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
//        recyclerView = root.findViewById(R.id.routeRecyclerView);
//        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setHasFixedSize(true);
//        homeAdapter = new HomeAdapter();
//        homeAdapter.setClickListener(this);
//        recyclerView.setAdapter(homeAdapter);
        return root;


        //    GridView gv_home;
//
//    int logos[] = {R.drawable.home_work, R.drawable.attendance, R.drawable.fees, R.drawable.activities,
//            R.drawable.notices, R.drawable.notices, R.drawable.track_bus, R.drawable.meetings, R.drawable.events,
//            R.drawable.students, R.drawable.routes, R.drawable.time_table, R.drawable.news_feed, R.drawable.calandar, R.drawable.leaves};
//    String icons_title[] = {"Home Work", "Attendance", "Fees", "Activities", "Report", "Notices", "Track Bus", "Meetings", "Events", "Childrens", "Routes", "Time Table", "News Feed", "Calendar", "Leaves"};
//
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//
//
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        gv_home = root.findViewById(R.id.gv_home); // init GridView
//        // Create an object of HomeAdapter and set Adapter to GirdView
//        HomeAdapter homeAdapter = new HomeAdapter(getContext(), logos, icons_title);
//        gv_home.setAdapter(homeAdapter);
//        // implement setOnItemClickListener event on GridView
//        gv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // set an Intent to Another Activity
////                Toast.makeText(getActivity(), "id:"+id, Toast.LENGTH_SHORT).show();
////                Toast.makeText(getActivity(), "position:"+position, Toast.LENGTH_SHORT).show();
//
//
//                if (position == 0) {
//                    Intent intent = new Intent(getActivity(), HomeWorkActivity.class);
//                    intent.putExtra("value", "Home");
//                    startActivity(intent);
//
//                } else if (position == 1) {
//                    Intent intent = new Intent(getActivity(), AttendanceActivity.class);
//                    intent.putExtra("value", "Attendance");
//                    startActivity(intent);
//                } else if (position == 2) {
//                    Intent intent = new Intent(getActivity(), FeesActivity.class);
//                    intent.putExtra("value", "FeesActivity");
//                    startActivity(intent);
//                } else if (position == 3) {
//                    Intent intent = new Intent(getActivity(), ActivitiesActivity.class);
//                    intent.putExtra("value", "ActivitiesActivity");
//                    startActivity(intent);
//                } else if (position == 4) {
//                    Intent intent = new Intent(getActivity(), ReportsActivity.class);
//                    intent.putExtra("value", "ActivitiesActivity");
//                    startActivity(intent);
//                } else if (position == 5) {
//                    Intent intent = new Intent(getActivity(), NoticesActivity.class);
//                    intent.putExtra("value", "NoticesActivity");
//                    startActivity(intent);
//                } else if (position == 6) {
//                    Intent intent = new Intent(getActivity(), TrackBusActivity.class);
//                    intent.putExtra("value", "TrackBusActivity");
//                    startActivity(intent);
//                } else if (position == 7) {
//                    Intent intent = new Intent(getActivity(), MeetingsActivity.class);
//                    intent.putExtra("value", "MeetingsActivity");
//                    startActivity(intent);
//                } else if (position == 8) {
//                    Intent intent = new Intent(getActivity(), EventsActivity.class);
//                    intent.putExtra("value", "EventsActivity");
//                    startActivity(intent);
//                } else if (position == 9) {
//                    Intent intent = new Intent(getActivity(), ChildrensActivity.class);
//                    intent.putExtra("value", "ChildrensActivity");
//                    startActivity(intent);
//                } else if (position == 10) {
//                    Intent intent = new Intent(getActivity(), RoutesActivity.class);
//                    intent.putExtra("value", "RoutesActivity");
//                    startActivity(intent);
//                } else if (position == 11) {
//                    Intent intent = new Intent(getActivity(), TimeTableActivity.class);
//                    intent.putExtra("value", "TimeTableActivity");
//                    startActivity(intent);
//                } else if (position == 12) {
//                    Intent intent = new Intent(getActivity(), NewsFeedActivity.class);
//                    intent.putExtra("value", "NewsFeedActivity");
//                    startActivity(intent);
//                } else if (position == 13) {
//                    Intent intent = new Intent(getActivity(), CalendarActivity.class);
//                    intent.putExtra("value", "Calendar");
//                    startActivity(intent);
//                } else if (position == 14) {
//                    Intent intent = new Intent(getActivity(), LeavesActivity.class);
//                    intent.putExtra("value", "LeavesActivity");
//                    startActivity(intent);
//                }
//            }
//        });
//        return root;
//    }
    }
}
