package com.henco.dietapp.Factories;


import com.henco.dietapp.Domain.User;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UserFactoryTest {
    Map<String,String> values;

    @org.junit.Before
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id", "123456");
        values.put("fname","Henco");
        values.put("lname", "Hougaard");
        values.put("length", "1.88");
        values.put("weight", "110");
    }

    @org.junit.Test
    public void getUser() throws Exception {
        User user = UserFactory.getUser(values, 123456);
        assertEquals("Henco", user.getFname());
    }

}