package org.example.model;

import java.util.Objects;

public class Person {

    //fields
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    private AppUser credentials;

    //constructor
    public Person(String firstName, String lastName, String email, AppUser credentials) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setCredentials(credentials);
    }

    public Person(int id, String firstName, String lastName, String email, AppUser credentials) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.credentials = credentials;
    }

    public Person(String firstName, String lastName, AppUser credentials) {
        setFirstName(firstName);
        setLastName(lastName);
        setCredentials(credentials);
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

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        if(credentials == null) throw new IllegalArgumentException(" credentials param was null");
        this.credentials = credentials;
    }

    /*public String getSummary (){
        return " person with ID : " + id + " first name : " + firstName + " last name : " + lastName + " email address : " + email;
    }

     */

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email) && Objects.equals(credentials, person.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, credentials);
    }
}
