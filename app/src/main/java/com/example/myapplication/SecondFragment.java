package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: take the data in input fields and upload it to firebase
                // TODO: fix getting input data from user
                EditText taskTitleView = (EditText) view.findViewById(R.id.title_field);
                EditText taskTimeView = binding.timeField;
                EditText taskPriorityView = binding.priorityField;
                EditText taskSubjectView = binding.subjectField;

                String taskTitle = taskTitleView.getText().toString().trim();
                String taskTime = taskTimeView.getText().toString().trim();
                String taskPriority = taskPriorityView.getText().toString().trim();
                String taskSubject = taskSubjectView.getText().toString().trim();

                Log.i("tasktitle", taskTitle);
                Log.i("taskTime", taskTime);
                Log.i("taskPriority", taskPriority);
                Log.i("taskSubject", taskSubject);



                //Navigate back to the first fragment
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}