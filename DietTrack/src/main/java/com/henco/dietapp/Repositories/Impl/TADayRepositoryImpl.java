package com.henco.dietapp.Repositories.Impl;

import com.henco.dietapp.Domain.TADay;
import com.henco.dietapp.Repositories.TADayRepository;

import java.util.HashMap;
import java.util.Map;

public class TADayRepositoryImpl implements TADayRepository {

    private static TADayRepositoryImpl repository = null;

    private Map<Integer, TADay> taDayTable;

    private TADayRepositoryImpl(){
        taDayTable = new HashMap<Integer, TADay>();
    }

    public static TADayRepositoryImpl getInstance(){
        if(repository==null)
            repository = new TADayRepositoryImpl();
        return repository;
    }

    @Override
    public TADay create(TADay taDay) {
        taDayTable.put(taDay.getDay(),taDay);
        TADay savedTaDay = taDayTable.get(taDay.getDay());
        return savedTaDay;
    }

    @Override
    public TADay read(int day) {
        TADay taDay = taDayTable.get(day);
        return taDay;
    }

    @Override
    public TADay update(TADay taDay) {
        taDayTable.put(taDay.getDay(),taDay);
        TADay savedTaDay = taDayTable.get(taDay.getDay());
        return savedTaDay;
    }

    @Override
    public void delete(int day) {
        taDayTable.remove(day);
    }
}
