package com.norteksoft.springbootdemo.controller;

import com.norteksoft.springbootdemo.entity.User;
import com.norteksoft.springbootdemo.exception.ResourceNotFoundException;
import com.norteksoft.springbootdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gege
 */
@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()//Post  等同于 create
    public User createVehicle(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("list")
    public Page<User> users(@RequestParam(value = "pageNum",defaultValue = "0") Integer pageNum,
                            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return userService.users(pageNum,pageSize);
    }
    @GetMapping("{userId}")
    public User getUser(@PathVariable Long userId){
        return userService.get(userId).orElseThrow(()-> new ResourceNotFoundException("not entity!"));
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteVehicle(@PathVariable Long userId){
        return userService.get(userId).map(vehicle -> {
            userService.delete(userId);
            return ResponseEntity.ok().build();//返回成功
        }).orElseThrow(()->new ResourceNotFoundException("userId:"+userId +"  not fount"));
    }
}
