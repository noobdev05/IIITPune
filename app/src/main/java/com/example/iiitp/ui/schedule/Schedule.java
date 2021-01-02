package com.example.iiitp.ui.schedule;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.iiitp.R;
import com.example.iiitp.ui.scholarship.utilities.ScholarshipAdapter;
import com.example.iiitp.ui.scholarship.utilities.ScholarshipData;

public class Schedule extends Fragment {
    private RecyclerView recyclerView;
  //  private ScheduleViewModel mViewModel;
  private Scheduledata[] mdata;
  private ScheduleAdapter adapter;
    public static Schedule newInstance() {
        return new Schedule();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.schedule_fragment, container, false);
        mdata = new Scheduledata[]{
                new Scheduledata("FY Schedule"),
                new Scheduledata("SY Schedule"),
                new Scheduledata("TY Schedule"),
                new Scheduledata("Final Year Schedule")
        };
        recyclerView = (RecyclerView)view.findViewById(R.id.schedule_recyclerview);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

       adapter = new ScheduleAdapter(mdata);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
     //   mViewModel = new ViewModelProvider(this).get(ScheduleViewModel.class);
        // TODO: Use the ViewModel
    }

}