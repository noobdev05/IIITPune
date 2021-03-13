package com.example.iiitp.ui.faculty;

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
import com.example.iiitp.ui.faculty.utlities.FacultyAdapter;
import com.example.iiitp.ui.faculty.utlities.FacultyData;

public class Faculty extends Fragment {

    public static Faculty newInstance() {
        return new Faculty();
    }

    private FacultyData[] mData;
    private FacultyAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.faculty_fragment, container, false);
        mData = new FacultyData[]{
            new FacultyData("Dr. Ritu Tiwari","Designation Professor",
                    "Educational Qualification Ph.D. (NIT Raipur)","tiwariritu2@gmail.com",
                    "+91 6263302955",R.drawable.ritu_mam)};

        recyclerView = view.findViewById(R.id.faculty_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        adapter = new FacultyAdapter(mData);
        recyclerView.setAdapter(adapter);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}