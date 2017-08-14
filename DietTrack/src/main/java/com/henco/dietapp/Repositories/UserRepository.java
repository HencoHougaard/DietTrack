package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.User;

public interface UserRepository {
    User create(User user);

    User read(int id);

    User update(User user);

    void delete(int id);
}
