package org.example;

import java.util.Objects;

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

     public ToDoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
          this.id = ++sequence;
         setAssigned(assigned);
          setTodoItem(todoItem);
          setAssignee(assignee);
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
          this.assignee = assignee;
          if( assignee != null){
               this.assigned = true;
          }else{
               this.assigned = false;
          }
     }

     public String getSummary(){
          return null;
     }

     @Override
     public String toString() {
          return "ToDoItemTask{" +
                  "id=" + id +
                  ", assigned=" + assigned +
                  ", todoItem=" + todoItem +
                  ", assignee=" + assignee +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          ToDoItemTask that = (ToDoItemTask) o;
          return id == that.id && assigned == that.assigned && sequence == that.sequence
                  && Objects.equals(todoItem, that.todoItem) && Objects.equals(assignee, that.assignee);
     }

     @Override
     public int hashCode() {
          return Objects.hash(id, assigned, todoItem, assignee, sequence);
     }
}
