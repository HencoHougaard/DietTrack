package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.TADay;

public interface TADayService {
    TADay create(TADay taDay);
    TADay read(int day);
    TADay update(TADay taDay);
    void delete(int day);
}
