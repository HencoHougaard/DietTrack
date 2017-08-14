package com.henco.dietapp.Repositories.Impl;

import com.henco.dietapp.Domain.User;
import com.henco.dietapp.Repositories.UserRepository;


import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository{

    private static UserRepositoryImpl repository = null;

    private Map<Integer, User> userTable;

    private UserRepositoryImpl(){
        userTable = new HashMap<Integer, User>();
    }

    public static UserRepositoryImpl getInstance(){
        if(repository==null)
            repository = new UserRepositoryImpl();
        return repository;
    }

    @Override
    public User create(User user) {
        userTable.put(user.getId(),user);
        User savedUser = userTable.get(user.getId());
        return savedUser;
    }

    @Override
    public User read(int id) {
        User user = userTable.get(id);
        return user;
    }

    @Override
    public User update(User user) {
        userTable.put(user.getId(),user);
        User savedUser = userTable.get(user.getId());
        return savedUser;
    }

    @Override
    public void delete(int id) {
        userTable.remove(id);
    }
}
