package com.norteksoft.springbootdemo.services.impl;

import com.norteksoft.springbootdemo.entity.Vehicle;
import com.norteksoft.springbootdemo.repostitory.VehicleRepository;
import com.norteksoft.springbootdemo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Optional<Vehicle> get(Long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
       vehicleRepository.deleteById(id);
    }

    @Override
    public void deleteEntity(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }

    @Override
    public int countByVin(String vin) {
        return vehicleRepository.countByVin(vin);
    }

    @Override
    public Optional<Vehicle> findByVin(String vin) {
        return vehicleRepository.findByVin(vin);
    }
}
