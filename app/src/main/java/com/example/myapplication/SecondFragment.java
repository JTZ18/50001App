package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentSecondBinding;
import com.example.myapplication.models.UserTask;
import com.example.myapplication.models.Tasks;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                // TODO: take the data in input fields and upload it to firebase
                // TODO: fix getting input data from user
//                EditText taskTitleView = (EditText) view.findViewById(R.id.title_field);
//                EditText taskTimeView = binding.timeField;
//                EditText taskPriorityView = binding.priorityField;
//                EditText taskSubjectView = binding.subjectField;
//
//                String taskTitle = taskTitleView.getText().toString().trim();
//                String taskTime = taskTimeView.getText().toString().trim();
//                String taskPriority = taskPriorityView.getText().toString().trim();
//                String taskSubject = taskSubjectView.getText().toString().trim();
//
//                Log.i("tasktitle", taskTitle);
//                Log.i("taskTime", taskTime);
//                Log.i("taskPriority", taskPriority);
//                Log.i("taskSubject", taskSubject);

                LocalDateTime rightnow = LocalDateTime.now();
                String tag1 = "urgent";
                UserTask task1 = new UserTask("Revise math", "I hate math", "orange", rightnow, rightnow, "Science", tag1, "Not Done");

                Tasks tasks = new Tasks();
                tasks.addTask(task1);


                FirebaseAuth mAuth = FirebaseAuth.getInstance();
                FirebaseFirestore mStore = FirebaseFirestore.getInstance();

                DocumentReference docRef = FirebaseFirestore.getInstance().collection("users").document("TawQUCqUSvR8evoOYhhjJYVsA343");
                Log.i("document", docRef.get().toString());

                // Create a new user with a first and last name
                Map<String, Object> user = new HashMap<>();
                user.put("first", "Ada");
                user.put("last", "Lovelace");
                user.put("born", 1815);

// Add a new document with a generated ID
                FirebaseFirestore.getInstance().collection("users")
                        .add(user)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Log.i("upload test", "DocumentSnapshot added with ID: " + documentReference.getId());
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("upload test", "Error adding document", e);
                            }
                        });
//                String userID = mAuth.getCurrentUser().getUid(); // get user ID in firebase
//                DocumentReference documentReference = mStore.collection("users").document(userID);
//                Map<String, Object> user = new HashMap<>();
//                user.put("Name", "noj");
//                user.put("Email", "noemail.com");
//                user.put("Task List", tasks);
//                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void unused) {
//                        Log.d("test uplaod", "onSuccess: user Profile is created for " + userID);
//                    }
//                });


                //Navigate back to the first fragment
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    } ;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}