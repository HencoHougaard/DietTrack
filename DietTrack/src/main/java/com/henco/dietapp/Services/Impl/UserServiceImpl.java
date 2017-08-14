package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.User;
import com.henco.dietapp.Repositories.Impl.UserRepositoryImpl;
import com.henco.dietapp.Repositories.UserRepository;
import com.henco.dietapp.Services.UserService;

public class UserServiceImpl implements UserService{
    private static UserServiceImpl service = null;

    UserRepository repository = UserRepositoryImpl.getInstance();

    public static UserServiceImpl getInstance(){
        if(service == null)
            service = new UserServiceImpl();
        return service;
    }

    @Override
    public User create(User user) {
        return repository.create(user);
    }

    @Override
    public User read(int id) {
        return repository.read(id);
    }

    @Override
    public User update(User user) {
        return repository.update(user);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
