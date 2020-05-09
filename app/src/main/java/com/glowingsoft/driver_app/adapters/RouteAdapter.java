package com.glowingsoft.driver_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.glowingsoft.driver_app.R;


public class RouteAdapter extends RecyclerView.Adapter<RouteAdapter.HomeViewHolder> {

    private ClickListener clickListener;


    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item_route, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder homeViewHolder, final int position) {

        homeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onRecyclerViewItemClicked(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public interface ClickListener {
        void onRecyclerViewItemClicked(int position);
    }

//    Context context;
//    int logos[];
//    String icons_title[];
//    LayoutInflater inflater;
//
//    public HomeAdapter(Context applicationContext, int[] logos, String[] icons_title) {
//        this.context = applicationContext;
//        this.logos = logos;
//        this.icons_title = icons_title;
//        inflater = (LayoutInflater.from(applicationContext));
//    }
//
//    @Override
//    public int getCount() {
//        return logos.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View view, ViewGroup parent) {
//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        view = inflater.inflate(R.layout.row_home, null); // inflate the layout
//        ImageView logo = view.findViewById(R.id.icon); // get the reference of ImageView
//        TextView icon_title = view.findViewById(R.id.tv_title);
//        logo.setImageResource(logos[position]); // set logo images
//        icon_title.setText(icons_title[position]);
//        return view;
//    }
}
