package com.example.myapplication.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

//NOTE: for front end UI to view
public class TaskComponent extends Task {
    public TaskComponent(String title, String description, String color, LocalDateTime startDateTime, LocalDateTime endDateTime, ArrayList<String> tags, String status) {
        super(title, description, color, startDateTime, endDateTime, tags, status);
    }
}
