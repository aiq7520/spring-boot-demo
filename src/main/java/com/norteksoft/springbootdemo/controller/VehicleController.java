package com.norteksoft.springbootdemo.controller;

import com.norteksoft.springbootdemo.entity.Vehicle;
import com.norteksoft.springbootdemo.exception.ResourceNotFoundException;
import com.norteksoft.springbootdemo.services.VehicleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/vehicles/")//Post  等同于 create
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        String vin = vehicle.getVin();
        int count = vehicleService.countByVin(vehicle.getVin());
        if(count!=0) {
          throw   new ResourceNotFoundException("VIN:" + vin + "  already exists");
        }
        //vehicleService.findByVin(vin).
        return vehicleService.save(vehicle);
    }

    @GetMapping("/vehicles/{vehicleId}")
    public Vehicle getVehicle(@PathVariable long vehicleId){
        return vehicleService.get(vehicleId)
         .orElseThrow(()->new ResourceNotFoundException("vehicleId:"+vehicleId +"  not fount"));
    }

    @DeleteMapping("/vehicles/{vehicleId}")
    public ResponseEntity<?> deleteVehicle(@PathVariable Long vehicleId){
        return vehicleService.get(vehicleId).map(vehicle -> {
            vehicleService.delete(vehicleId);
            return ResponseEntity.ok().build();//返回成功
        }).orElseThrow(()->new ResourceNotFoundException("vehicleId:"+vehicleId +"  not fount"));
    }

    @PutMapping("/vehicles/{vehicleId}")
    public Vehicle updateVehicle(@PathVariable Long vehicleId,@RequestBody Vehicle vehicle){
        return vehicleService.get(vehicleId).map(vehicleInDB ->{
            BeanUtils.copyProperties(vehicle,vehicleInDB);
           return vehicleService.save(vehicle);
          //  return ResponseEntity.ok().build();//返回成功
        }).orElseThrow(()->new ResourceNotFoundException("vehicleId:"+vehicleId +"  not fount"));
    }
}
