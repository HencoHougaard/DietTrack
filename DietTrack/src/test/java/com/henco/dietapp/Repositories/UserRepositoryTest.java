package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.User;
import com.henco.dietapp.Factories.UserFactory;
import com.henco.dietapp.Repositories.Impl.UserRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UserRepositoryTest {
    Map<String,String> values;
    UserRepository repository;

    @Before
    public void setUp() throws Exception {

        repository = UserRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id", "123456");
        values.put("fname","Henco");
        values.put("lname", "Hougaard");
        values.put("length", "1.88");
        values.put("weight", "110");
    }

    @Test
    public void create() throws Exception {
        User user = UserFactory.getUser(values, 123456);
        repository.create(user);
        assertEquals(123456, user.getId());
    }

    @Test
    public void read() throws Exception {
        User readUser = repository.read(123456);
        assertEquals(123456, readUser.getId());
    }

    @Test
    public void update() throws Exception {
        User user = repository.read(123456);
        User newUser = new User.Builder()
                .id(123456)
                .fname(values.get("Henco"))
                .sname(values.get("Hougaard"))
                .length(values.get("1.88"))
                .weight(values.get("110"))
                .build();
        repository.update(newUser);
        User UpdateUser = repository.read(123456);
        assertEquals(123456, UpdateUser.getId());
    }

    @Test
    public void delete() throws Exception {
        repository.delete(123456);
        User user = repository.read(123456);
        assertNull(user);
    }

}