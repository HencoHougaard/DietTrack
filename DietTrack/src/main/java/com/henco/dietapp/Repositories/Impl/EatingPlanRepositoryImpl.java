package com.henco.dietapp.Repositories.Impl;

import com.henco.dietapp.Domain.EatingPlan;
import com.henco.dietapp.Repositories.EatingPlanRepository;

import java.util.HashMap;
import java.util.Map;

public class EatingPlanRepositoryImpl implements EatingPlanRepository{

    private static EatingPlanRepositoryImpl repository = null;

    private Map<Integer, EatingPlan> eatingPlanTable;

    private EatingPlanRepositoryImpl(){
        eatingPlanTable = new HashMap<Integer, EatingPlan>();
    }

    public static EatingPlanRepositoryImpl getInstance(){
        if(repository==null)
            repository = new EatingPlanRepositoryImpl();
        return repository;
    }

    @Override
    public EatingPlan create(EatingPlan eatingPlan) {
        eatingPlanTable.put(eatingPlan.getDay(),eatingPlan);
        EatingPlan savedEatingPlan = eatingPlanTable.get(eatingPlan.getDay());
        return savedEatingPlan;
    }

    @Override
    public EatingPlan read(int day) {
        EatingPlan eatingPlan = eatingPlanTable.get(day);
        return eatingPlan;
    }

    @Override
    public EatingPlan update(EatingPlan eatingPlan) {
        eatingPlanTable.put(eatingPlan.getDay(),eatingPlan);
        EatingPlan savedEatingPlan = eatingPlanTable.get(eatingPlan.getDay());
        return savedEatingPlan;
    }

    @Override
    public void delete(int day) {
        eatingPlanTable.remove(day);
    }
}
