package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.Banting;

public interface BantingRepository {
    Banting create(Banting banting);

    Banting read(int day);

    Banting update(Banting banting);

    void delete(int day);
}
