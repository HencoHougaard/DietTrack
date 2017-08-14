package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.EatingPlan;

public interface EatingPlanService {

    EatingPlan create(EatingPlan eatingPlan);
    EatingPlan read(int day);
    EatingPlan update(EatingPlan eatingPlan);
    void delete(int day);
}
