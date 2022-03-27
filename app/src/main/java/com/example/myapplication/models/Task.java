package com.example.myapplication.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
// NOTE: for backend database to use and capture
public class Task {
    private String title;
    private String description;
    private String color;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private ArrayList<String> tags;
    private String status = "Not Done"; // either "Not Done" or "Completed"

    //constructor
    public Task(String title, String description, String color, LocalDateTime startDateTime, LocalDateTime endDateTime, ArrayList<String> tags, String status) {
        this.title = title;
        this.description = description;
        this.color = color;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.tags = tags;
        this.status = status;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
