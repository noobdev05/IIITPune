package com.example.iiitp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iiitp.ui.scholarship.utilities.ScholarshipAdapter;
import com.example.iiitp.ui.scholarship.utilities.ScholarshipData;

class FacultyListAdapter extends RecyclerView.Adapter<FacultyListAdapter.FacultyViewHolder> {

    public FacultyListAdapter(int i) {

    }
    public FacultyData[] mdata;
    public FacultyListAdapter(FacultyData[] dataSet, MyClickListener listener) {
        mdata = dataSet;
        myClickListener = listener;
    }
     private MyClickListener myClickListener;

    public interface MyClickListener{
        void myOnClick(int position);
    }


    @Override
    public FacultyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.scholarship_layout, viewGroup, false);

        return new FacultyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull FacultyListAdapter.FacultyViewHolder holder, int position) {
        holder.textView.setText(mdata[position].name);
        holder.imageView.setImageResource(mdata[position].imageId);
    }
    @Override
    public int getItemCount() {
        return mdata.length;
    }
    public class FacultyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView textView;
        private final ImageView imageView;

        public FacultyViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView = (TextView) view.findViewById(R.id.textView);
            imageView = (ImageView) view.findViewById(R.id.faculty_imageview);
            view.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            myClickListener.myOnClick(position);
        }
    }
}
