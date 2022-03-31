package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.models.TaskListAdapter;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    private LinkedList<String> taskList = new LinkedList<>();
    private LinkedList<String> mTaskList;
    private RecyclerView mRecyclerView;
    private TaskListAdapter mAdapter;

    // Add RecyclerView member
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        mTaskList.add("hi");
        mTaskList.add("there");


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setAdapter(new TaskListAdapter(view.getContext(), mTaskList));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//        // Get a handle to the RecyclerView.
//        mRecyclerView = view.findViewById(R.id.recyclerview);
//        // Create an adapter and supply the data to be displayed.
//        mAdapter = new TaskListAdapter(view.getContext(), mTaskList);
//        // Connect the adapter with the RecyclerView.
//        mRecyclerView.setAdapter(mAdapter);
//        // Give the RecyclerView a default layout manager.


        return view;
    }

}