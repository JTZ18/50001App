package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.models.RecyclerItemClickListener;
import com.example.myapplication.models.UserTask;
import com.example.myapplication.models.TaskListAdapter;
import com.example.myapplication.models.Tasks;

import java.time.LocalDateTime;

public class BlankFragment extends Fragment {
    private Tasks tasks= new Tasks();

    // Add RecyclerView member
    private RecyclerView recyclerView;

    @RequiresApi(api = Build.VERSION_CODES.O)


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        {

            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_blank, container, false);

            // initialise some data for testing
            String tag1 = "urgent";
            String tag2 = "due";
            String tag3 = "overdue";
            String tag4 = "Low";
            String tag5 = "Mid";
            String tag6 = "High";
            String status1 = "Not Done";
            String status2 = "Completed";
            LocalDateTime rightnow = LocalDateTime.now();
            UserTask userTask1 = new UserTask("Revise math", "I hate math", "orange", rightnow, rightnow, "Science", tag1, "Not Done");
            UserTask userTask2 = new UserTask("test2", "i love math", "blue", rightnow, rightnow, "Math", tag2, "Not Done");
            UserTask userTask3 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask4 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask5 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask6 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask7 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask8 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask9 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask10 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask11 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask12 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            UserTask userTask13 = new UserTask("jefifjeioajfoej", "feijfoiajfngi", "blue", rightnow, rightnow, "physics", tag3, "Not Done");
            tasks.addTask(userTask1);
            tasks.addTask(userTask2);
            tasks.addTask(userTask3);
            tasks.addTask(userTask4);
            tasks.addTask(userTask5);
            tasks.addTask(userTask6);
            tasks.addTask(userTask7);
            tasks.addTask(userTask8);
            tasks.addTask(userTask9);
            tasks.addTask(userTask10);
            tasks.addTask(userTask11);
            tasks.addTask(userTask12);
            tasks.addTask(userTask13);



            // Add the following lines to create RecyclerView
            recyclerView = view.findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setAdapter(new TaskListAdapter(1234, tasks));


            // onClickListener for click events on items in recylcer view
            recyclerView.addOnItemTouchListener(
                    new RecyclerItemClickListener(BlankFragment.this.getContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                        @Override public void onItemClick(View view, int position) {
                            // do whatever TODO: implement click on task handler what it should do next
                            Log.i("testTouch", "fragment touched");
                        }

                        @Override public void onLongItemClick(View view, int position) {
                            // do whatever
                        }
                    })
            );

            return view;
        }
    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(BlankFragment.this)
//                        .navigate(R.id.action_blankFragment_to_SecondFragment);
//            }
//        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }

}