package com.company.repositories.interfaces;

import com.company.entities.Company;
import com.company.entities.Company;

import java.util.List;

public interface IEmployzReprository {
    boolean createUser(Company user);
    Company getUser(int id);
    List<Company> getAllUsers();
}
