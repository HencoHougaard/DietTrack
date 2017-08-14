package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.TADay;

import java.util.Map;

public class TADayFactory {
    public static TADay getTADay(Map<String, String> values, int day){
        TADay taDay = new TADay.Builder()
                .day(day)
                .foodType(values.get("foodType"))
                .fluids(values.get("fluids"))
                .build();
        return taDay;
    }
}
