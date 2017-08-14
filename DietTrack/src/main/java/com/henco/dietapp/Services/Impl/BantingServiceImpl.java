package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.Banting;
import com.henco.dietapp.Repositories.BantingRepository;
import com.henco.dietapp.Repositories.Impl.BantingRepositoryImpl;
import com.henco.dietapp.Services.BantingService;

public class BantingServiceImpl implements BantingService {

    private static BantingServiceImpl service = null;

    BantingRepository repository = BantingRepositoryImpl.getInstance();

    public static BantingServiceImpl getInstance(){
        if(service == null)
            service = new BantingServiceImpl();
        return service;
    }


    @Override
    public Banting create(Banting banting) {
        return repository.create(banting);
    }

    @Override
    public Banting read(int day) {
        return repository.read(day);
    }

    @Override
    public Banting update(Banting banting) {
        return repository.update(banting);
    }

    @Override
    public void delete(int day) {
        repository.delete(day);
    }
}
