package com.henco.dietapp.Services;

import com.henco.dietapp.Domain.Registration;

public interface RegistrationService {
    Registration create(Registration registration);

    Registration read(int id);

    Registration update(Registration registration);

    void delete(int id);
}
