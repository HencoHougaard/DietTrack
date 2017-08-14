package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.EatingPlan;

public interface EatingPlanRepository {
    EatingPlan create(EatingPlan eatingPlan);

    EatingPlan read(int day);

    EatingPlan update(EatingPlan eatingPlan);

    void delete(int day);
}
