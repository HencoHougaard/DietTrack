package com.henco.dietapp.Repositories.Impl;

import com.henco.dietapp.Domain.Banting;
import com.henco.dietapp.Repositories.BantingRepository;

import java.util.HashMap;
import java.util.Map;

public class BantingRepositoryImpl implements BantingRepository{

    private static BantingRepositoryImpl repository = null;

    private Map<Integer, Banting> bantingTable;

    private BantingRepositoryImpl(){
        bantingTable = new HashMap<Integer, Banting>();
    }

    public static BantingRepositoryImpl getInstance(){
        if(repository==null)
            repository = new BantingRepositoryImpl();
        return repository;
    }

    @Override
    public Banting create(Banting banting) {
        bantingTable.put(banting.getDay(),banting);
        Banting savedBanting = bantingTable.get(banting.getDay());
        return savedBanting;
    }

    @Override
    public Banting read(int day) {
        Banting banting = bantingTable.get(day);
        return banting;
    }

    @Override
    public Banting update(Banting banting) {
        bantingTable.put(banting.getDay(),banting);
        Banting savedBanting = bantingTable.get(banting.getDay());
        return savedBanting;
    }

    @Override
    public void delete(int day) {
        bantingTable.remove(day);
    }
}
