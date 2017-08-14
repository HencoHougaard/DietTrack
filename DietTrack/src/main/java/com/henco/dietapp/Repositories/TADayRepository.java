package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.TADay;

public interface TADayRepository {
    TADay create(TADay taDay);

    TADay read(int day);

    TADay update(TADay taDay);

    void delete(int day);
}
