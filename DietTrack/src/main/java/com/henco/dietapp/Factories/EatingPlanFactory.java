package com.henco.dietapp.Factories;

import com.henco.dietapp.Domain.EatingPlan;

import java.util.Map;

public class EatingPlanFactory {

    public static EatingPlan getEatingPlan(Map<String, String> values, int day){
        EatingPlan eatingPlan = new EatingPlan.Builder()
                .day(day)
                .foodType(values.get("foodType"))
                .fluids(values.get("fluids"))
                .build();
        return eatingPlan;
    }
}
