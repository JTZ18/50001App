package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityExploreBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class explore extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityExploreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityExploreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





        ImageButton addTaskButton = findViewById(R.id.addTaskButton);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction()
//                        .replace(R.id.fragmentContainerView, AddTaskFragment.class, null)
//                        .setReorderingAllowed(true)
//                        .addToBackStack("name")
//                        .commit();
//                FragmentContainerView fragmentContainerView = findViewById(R.id.fragmentContainerView);
//                fragmentContainerView.setVisibility(View.VISIBLE);
                TextView card = findViewById(R.id.textView2);
                EditText newTodoView = findViewById(R.id.editTextValue);
                EditText descriptionView = findViewById(R.id.editTextValue2);
                EditText startDateTimeView = findViewById(R.id.editTextValue3);
                EditText endDateTimeView = findViewById(R.id.editTextValue4);
                EditText tagsView = findViewById(R.id.editTextValue5);
                ImageButton closeIconButton = findViewById(R.id.imageButton3);

                card.setVisibility(View.VISIBLE);
                newTodoView.setVisibility(View.VISIBLE);
                descriptionView.setVisibility(View.VISIBLE);
                startDateTimeView.setVisibility(View.VISIBLE);
                endDateTimeView.setVisibility(View.VISIBLE);
                tagsView.setVisibility(View.VISIBLE);
                closeIconButton.setVisibility(View.VISIBLE);
                

            }
        });

        ImageButton closeIconButton = findViewById(R.id.imageButton3);
        closeIconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView card = findViewById(R.id.textView2);
                EditText newTodoView = findViewById(R.id.editTextValue);
                EditText descriptionView = findViewById(R.id.editTextValue2);
                EditText startDateTimeView = findViewById(R.id.editTextValue3);
                EditText endDateTimeView = findViewById(R.id.editTextValue4);
                EditText tagsView = findViewById(R.id.editTextValue5);
                ImageButton closeIconButton = findViewById(R.id.imageButton3);

                card.setVisibility(View.INVISIBLE);
                newTodoView.setVisibility(View.INVISIBLE);
                descriptionView.setVisibility(View.INVISIBLE);
                startDateTimeView.setVisibility(View.INVISIBLE);
                endDateTimeView.setVisibility(View.INVISIBLE);
                tagsView.setVisibility(View.INVISIBLE);
                closeIconButton.setVisibility(View.INVISIBLE);


            }
        });

    }

    @Override
    protected void onStart() {

        Calendar c = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
//        String currentDateTime = sdf.format(new Date());
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);


        String greeting = null;
        if(timeOfDay >= 0 && timeOfDay < 12){
            greeting = "Morning";
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            greeting = "Afternoon";
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            greeting = "Evening";
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            greeting = "Night";
        }
        TextView greetingView = findViewById(R.id.greeting);
        greetingView.setText("Good " + greeting + ",");

        super.onStart();
    }


//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_explore);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
}