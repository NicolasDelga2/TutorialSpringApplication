package com.nicolasDev.fletapp.repositories;

import com.nicolasDev.fletapp.models.Client;
import com.nicolasDev.fletapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {
}
