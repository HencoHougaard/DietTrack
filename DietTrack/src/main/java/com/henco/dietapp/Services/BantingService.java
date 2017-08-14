package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.Banting;

public interface BantingService {

    Banting create(Banting banting);
    Banting read(int day);
    Banting update(Banting banting);
    void delete(int day);
}
