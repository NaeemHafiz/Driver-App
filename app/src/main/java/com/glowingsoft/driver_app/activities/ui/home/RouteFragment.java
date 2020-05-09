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
import com.glowingsoft.driver_app.adapters.RouteAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class RouteFragment extends Fragment implements RouteAdapter.ClickListener {

    private RouteAdapter routeAdapter;
    private RecyclerView rv_route;

    public RouteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_route, container, false);
        rv_route = view.findViewById(R.id.rv_route);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv_route.setLayoutManager(manager);
        rv_route.setHasFixedSize(true);
        routeAdapter = new RouteAdapter();
        routeAdapter.setClickListener(this);
        rv_route.setAdapter(routeAdapter);
        return view;
    }

    @Override
    public void onRecyclerViewItemClicked(int position) {
        Toast.makeText(getActivity(), "i am route fragment", Toast.LENGTH_SHORT).show();
    }
}
