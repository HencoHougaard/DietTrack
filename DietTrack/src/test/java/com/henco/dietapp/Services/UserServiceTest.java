package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.User;
import com.henco.dietapp.Factories.UserFactory;
import com.henco.dietapp.Services.Impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UserServiceTest {
    UserService service;
    Map<String,String> values;
    @Before
    public void setUp() throws Exception {
        service = new UserServiceImpl();
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
        service.create(user);
        assertEquals(123456, user.getId());
    }

    @Test
    public void read() throws Exception {
        User readUser = service.read(123456);
        assertEquals(123456, readUser.getId());
    }

    @Test
    public void update() throws Exception {
        User user = service.read(123456);
        User newUser = new User.Builder()
                .id(123456)
                .fname(values.get("Henco"))
                .sname(values.get("Hougaard"))
                .length(values.get("1.88"))
                .weight(values.get("110"))
                .build();
        service.update(newUser);
        User UpdateUser = service.read(123456);
        assertEquals(123456, UpdateUser.getId());
    }

    @Test
    public void delete() throws Exception {
        service.delete(123456);
        User user = service.read(123456);
        assertNull(user);
    }

}