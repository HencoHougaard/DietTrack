package com.henco.dietapp.Services.Impl;

import com.henco.dietapp.Domain.EatingPlan;
import com.henco.dietapp.Repositories.EatingPlanRepository;
import com.henco.dietapp.Repositories.Impl.EatingPlanRepositoryImpl;
import com.henco.dietapp.Services.EatingPlanService;

public class EatingPlanServiceImpl implements EatingPlanService {

    private static EatingPlanServiceImpl service = null;

    EatingPlanRepository repository = EatingPlanRepositoryImpl.getInstance();

    public static EatingPlanServiceImpl getInstance(){
        if(service == null)
            service = new EatingPlanServiceImpl();
        return service;
    }

    @Override
    public EatingPlan create(EatingPlan eatingPlan) {
        return repository.create(eatingPlan);
    }

    @Override
    public EatingPlan read(int day) {
        return repository.read(day);
    }

    @Override
    public EatingPlan update(EatingPlan eatingPlan) {
        return repository.create(eatingPlan);
    }

    @Override
    public void delete(int day) {
        repository.delete(day);
    }
}
