package com.todo.springboot.firstspringtodo.Models;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Task {
    private int id;
    private String task;
    private boolean complete;

    public Task() {

    }

    public Task(@JsonProperty("task") String task) {
        this.task = task;
        this.complete = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }


}
