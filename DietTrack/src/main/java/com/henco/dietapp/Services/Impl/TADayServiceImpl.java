package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.TADay;
import com.henco.dietapp.Repositories.Impl.TADayRepositoryImpl;
import com.henco.dietapp.Repositories.TADayRepository;
import com.henco.dietapp.Services.TADayService;

public class TADayServiceImpl implements TADayService {

    private static TADayServiceImpl service = null;

    TADayRepository repository = TADayRepositoryImpl.getInstance();

    public static TADayServiceImpl getInstance(){
        if(service == null)
            service = new TADayServiceImpl();
        return service;
    }


    @Override
    public TADay create(TADay taDay) {
        return repository.create(taDay);
    }

    @Override
    public TADay read(int day) {
        return repository.read(day);
    }

    @Override
    public TADay update(TADay taDay) {
        return repository.update(taDay);
    }

    @Override
    public void delete(int day) {
        repository.delete(day);
    }
}
