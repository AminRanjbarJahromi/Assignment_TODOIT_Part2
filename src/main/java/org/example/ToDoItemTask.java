package org.example;

public class ToDoItemTask {

     //field
     private int id;
     private boolean assigned;
     private TodoItem todoItem;
     private Person assignee;



     //constructor
     private int sequence = 30030;
     public ToDoItemTask(int id) {
          this.id = ++sequence;
     }

     //getter and setter


     public int getId() {
          return id;
     }


     public boolean isAssigned() {
          return assigned;
     }

     public void setAssigned(boolean assigned) {
          this.assigned = assigned;
          this.assigned = true;
     }

     public TodoItem getTodoItem() {
          return todoItem;
     }

     public void setTodoItem(TodoItem todoItem) {
          if(todoItem == null) throw new IllegalArgumentException(" todoItem param was null");
          this.todoItem = todoItem;
     }

     public Person getAssignee() {
          return assignee;
     }

     public void setAssignee(Person assignee) {
          if( assignee == null) throw new IllegalArgumentException(" assignee param was null ");
          this.assignee = assignee;
     }

     public String getSummary(){
          return assignee.getSummary();
     }

}
