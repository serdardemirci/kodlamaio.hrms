package com.serdardemirci.hrms.business.abstracts;

import com.serdardemirci.hrms.entities.concretes.User;

public interface UserService {
    User getById(int id);
}
