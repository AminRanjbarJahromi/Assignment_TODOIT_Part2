package org.example;

public class Person {

    //field
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //constructor
    private int sequence = 10010;
    public Person(){
        this.id = ++sequence;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //methode


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null) throw new IllegalArgumentException (" first name param was null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null) throw new IllegalArgumentException("last name param was null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null) throw new IllegalArgumentException(" email param was null");
        this.email = email;
    }

    public String getSummary (){
        return " person with ID : " + id + " first name : " + firstName + " last name : " + lastName + " email address : " + email;
    }
}
