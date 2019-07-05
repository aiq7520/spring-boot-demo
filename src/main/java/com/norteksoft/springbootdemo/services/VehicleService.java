package com.norteksoft.springbootdemo.services;

import com.norteksoft.springbootdemo.entity.Vehicle;

import java.util.Optional;

/**
 * @author gege
 */
public interface VehicleService {

    Vehicle save(Vehicle vehicle);

    Optional<Vehicle> get(Long id);

    void delete(Long id);

    void deleteEntity(Vehicle vehicle);

    int countByVin(String vin);

    Optional<Vehicle> findByVin(String vin);

}
