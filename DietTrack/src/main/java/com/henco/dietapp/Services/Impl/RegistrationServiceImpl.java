package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.Registration;
import com.henco.dietapp.Repositories.Impl.RegistrationRepositoryImpl;
import com.henco.dietapp.Repositories.RegistrationRepository;
import com.henco.dietapp.Services.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService{
    private static RegistrationServiceImpl service = null;

    RegistrationRepository repository = RegistrationRepositoryImpl.getInstance();

    public static RegistrationServiceImpl getInstance(){
        if(service == null)
            service = new RegistrationServiceImpl();
        return service;
    }

    @Override
    public Registration create(Registration registration) {
        return repository.create(registration);
    }

    @Override
    public Registration read(int id) {
        return repository.read(id);
    }

    @Override
    public Registration update(Registration registration) {
        return repository.update(registration);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
