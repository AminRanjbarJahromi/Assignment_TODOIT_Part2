package org.example.dao;

import org.example.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOImpl implements AppUserDAO {
    private List<AppUser> userStorage;

    public AppUserDAOImpl() {
        userStorage = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser was null");
        AppUser result = findByUsername(appUser.getUsername());
        if (result != null) throw new IllegalArgumentException("username was duplicate");
        userStorage.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        if (username == null) throw new IllegalArgumentException("username was null");
        for (AppUser appUser : userStorage)
            if (appUser.getUsername().equalsIgnoreCase(username)) return appUser;
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return new ArrayList<>(userStorage);
    }

    @Override
    public void remove(String username) {
        AppUser result1 = findByUsername(AppUser.getUsername());
        if (result1 != null) {

            userStorage.remove(username);
        }else {
            throw new IllegalArgumentException("The object not found");
        }


    }


}
