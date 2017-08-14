package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.User;

import java.util.Map;

public class UserFactory {

    public static User getUser(Map<String, String> values, int id){
        User user = new User.Builder()
                .id(id)
                .fname(values.get("fname"))
                .sname(values.get("sname"))
                .age(values.get("age"))
                .length(values.get("length"))
                .weight(values.get("weight"))
                .stomach(values.get("stomach"))
                .waist(values.get("waist"))
                .thigh(values.get("thigh"))
                .upperBody(values.get("upperBody"))
                .arm(values.get("arm"))
                .build();
        return user;
    }

}
