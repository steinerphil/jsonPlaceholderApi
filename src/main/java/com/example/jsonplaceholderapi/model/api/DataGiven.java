package com.example.jsonplaceholderapi.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataGiven {

    @JsonProperty("userId")  // when key in api differs to this field name
    private int userId;

    @JsonProperty
    private int id;

    @JsonProperty
    private String title;

    @JsonProperty
    private boolean completed;


    //getter and setter

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
