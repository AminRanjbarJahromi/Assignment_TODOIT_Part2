package org.example;

import java.util.Objects;

public class AppUser extends Person {

    //fields

    private String username;
    private String password;
    private AppRole role;

    //constructor


    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // methods


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username == null && username.isEmpty()) throw new IllegalArgumentException(" user name is not valid ");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password==null && password.isEmpty()) throw new IllegalArgumentException(" password is not valid");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if(role==null) throw new IllegalArgumentException(" role param was null");
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }


}
