package com.norteksoft.springbootdemo.repostitory;

import com.norteksoft.springbootdemo.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author gege
 * 车辆 数据层 接口
 */
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    int countByVin(String vin);
    Optional<Vehicle> findByVin(String vin);
}
