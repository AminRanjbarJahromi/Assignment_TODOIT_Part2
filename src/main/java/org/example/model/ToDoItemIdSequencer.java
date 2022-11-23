package org.example.model;

public class ToDoItemIdSequencer {

    private static int currentId = 200;


    public static int nextId() {
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        ToDoItemIdSequencer.currentId = currentId;
    }
}



