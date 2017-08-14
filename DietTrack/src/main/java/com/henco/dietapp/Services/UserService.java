package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.User;

public interface UserService {
    User create(User user);
    User read(int id);
    User update(User user);
    void delete(int id);
}
