package com.mohitaryanproject.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/user")
@RestController
public class Controller {


    @Autowired
    Service service ;

    @PostMapping("/add")
    public User insertUser(@RequestBody User user){
        //operation
        return service.insertUser(user);
    }

    @GetMapping("/get")
    public User getUser(@RequestParam int id){
        System.out.println("the id is: "+id);
        return service.getUser(id);
    }

    @PutMapping("/update")
    public User updateUser(@RequestParam int id,@RequestParam("ad") String address){
        System.out.println(id+" "+address);
        return service.updateUser(id,address);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        System.out.println("id is: "+id);

        return service.deleteUser(id);
    }

    @GetMapping("/db")
    public Map<Integer,User> getDb(){
        return service.getDb();
    }

}
