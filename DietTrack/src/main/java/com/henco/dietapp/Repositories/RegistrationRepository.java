package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.Registration;

public interface RegistrationRepository {

    Registration create(Registration registration);

    Registration read(int id);

    Registration update(Registration registration);

    void delete(int id);
}
