package com.henco.dietapp.Repositories.Impl;

import com.henco.dietapp.Domain.Registration;
import com.henco.dietapp.Repositories.RegistrationRepository;

import java.util.HashMap;
import java.util.Map;

public class RegistrationRepositoryImpl implements RegistrationRepository {
    public static RegistrationRepositoryImpl repository = null;

    private Map<Integer, Registration> registrationTable;

    private RegistrationRepositoryImpl(){
        registrationTable = new HashMap<Integer, Registration>();
    }

    public static RegistrationRepositoryImpl getInstance(){
        if(repository==null)
            repository = new RegistrationRepositoryImpl();
        return repository;
    }

    @Override
    public Registration create(Registration registration) {
        registrationTable.put(registration.getId(),registration);
        Registration savedRegistration = registrationTable.get(registration.getId());
        return savedRegistration;
    }

    @Override
    public Registration read(int id) {
        Registration registration = registrationTable.get(id);
        return registration;
    }

    @Override
    public Registration update(Registration registration) {
        registrationTable.put(registration.getId(),registration);
        Registration savedRegistration = registrationTable.get(registration.getId());
        return savedRegistration;
    }

    @Override
    public void delete(int id) {
        registrationTable.remove(id);
    }
}
