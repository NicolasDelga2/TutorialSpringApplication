package com.nicolasDev.fletapp.repositories;

import com.nicolasDev.fletapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Client, Integer> {
}
