package com.example.myapplication.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.LinkedList;

public class TaskListAdapter extends
        RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>  {

    //attributes
    private final LinkedList<String> mTaskList;
    private LayoutInflater mInflater;

    //constructor
    public TaskListAdapter(Context context,
                           LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mTaskList = wordList;
    }


    @NonNull
    @Override
    public TaskListAdapter.TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.tasklist_item,
                parent, false);
        return new TaskViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListAdapter.TaskViewHolder holder, int position) {

    }
// --------------
    @Override
    public int getItemCount() {
        return mTaskList.size();
    }

    class TaskViewHolder extends RecyclerView.ViewHolder {
        public final TextView taskItemView;
        final TaskListAdapter mAdapter;

        //constructor
        public TaskViewHolder(View itemView, TaskListAdapter adapter) {
            super(itemView);
            taskItemView = itemView.findViewById(R.id.taskTitle);
            this.mAdapter = adapter;
        }
    }
}
