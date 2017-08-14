package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.Registration;

import java.util.Map;

public class RegistrationFactory {
    public static Registration getRegistration(Map<String, String> values, int id){
        Registration registration = new Registration.Builder()
                .id(id)
                .username(values.get("username"))
                .email(values.get("email"))
                .password(values.get("password"))
                .gender(values.get("gender"))
                .dateOfBirth(values.get("dateOfBirth"))
                .build();
        return registration;
    }
}
