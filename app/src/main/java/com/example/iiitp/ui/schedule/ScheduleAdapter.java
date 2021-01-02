package com.example.iiitp.ui.schedule;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.iiitp.R;

import org.jetbrains.annotations.NotNull;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolder> {



    /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        public static class ViewHolder extends RecyclerView.ViewHolder {
            private TextView textView;

            public ViewHolder(View view) {
                super(view);
                // Define click listener for the ViewHolder's View

                textView = (TextView) view.findViewById(R.id.schedule_textView);
                //view.setOnClickListener(this);
            }

            public TextView getTextView() {
                return textView;
            }
        }

        /**
         * Initialize the dataset of the Adapter.
         *
         * @param dataSet String[] containing the data to populate views to be used
         * by RecyclerView.
         */
       public Scheduledata[] mdata;
        public ScheduleAdapter(Scheduledata[] dataSet) {
            mdata = dataSet;
        }

        // Create new views (invoked by the layout manager)
        @NotNull
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // Create a new view, which defines the UI of the list item
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.schedule_layout, viewGroup, false);

            return new ViewHolder(view);
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            viewHolder.getTextView().setText(position);
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mdata.length;
        }

    }


