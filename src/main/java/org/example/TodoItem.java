package org.example;

import java.time.LocalDate;

public class TodoItem {

    //field
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //constructor

    private int sequence = 20020;
    public TodoItem(){
        this.id = ++sequence;
        this.deadLine = LocalDate.of(2022,12,29);
    }



    //methode


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null) throw new IllegalArgumentException("title param was null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine() {
        if(deadLine == null) throw new IllegalArgumentException(" deadline param was null");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public boolean isOverDue(){
        LocalDate currentTime = LocalDate.now();
        if(currentTime.isAfter(deadLine)){
            return true;

        }else{

            return false;
        }

    }

    public String getSummary(){
        return creator.getSummary();
    }


}
