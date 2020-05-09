package com.glowingsoft.driver_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.glowingsoft.driver_app.R;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    private ClickListener clickListener;


    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }


    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item_schedule, parent, false);
        return new ScheduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
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

    public class ScheduleViewHolder extends RecyclerView.ViewHolder {

        public ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public interface ClickListener {
        void onRecyclerViewItemClicked(int position);
    }
}
