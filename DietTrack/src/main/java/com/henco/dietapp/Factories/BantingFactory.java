package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.Banting;

import java.util.Map;

public class BantingFactory {

    public static Banting getBanting(Map<String, String> values, int day){
        Banting banting = new Banting.Builder()
                .day(day)
                .foodType(values.get("foodType"))
                .fluids(values.get("fluids"))
                .build();
        return banting;
    }

}
