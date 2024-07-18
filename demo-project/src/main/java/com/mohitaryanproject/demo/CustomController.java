package com.mohitaryanproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jpa")
public class CustomController {

    @Autowired
    CustomService service;

    @PostMapping("/insert")
    public Employee saveEmployee(@RequestParam int id, @RequestParam String name, @RequestParam int age){
        return service.saveEmployee(id,name,age);
    }

    @GetMapping("get")
    public Employee getEmployeeById(@RequestParam int id){
        return service.getEmployeeById(id);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam int id,@RequestParam String name,@RequestParam int age){
        return service.updateEmployee(id, name, age);
    }

    @DeleteMapping("/delete")
    public String deleteEmployeeById(@RequestParam int id){
        return service.deleteEmployeeById(id);
    }

    @GetMapping("/getByName")
    public Employee getByName(@RequestParam String name){
        return service.getByName(name);
    }

    @GetMapping("-")
    public Employee getByNameAndAge(@RequestParam String name,@RequestParam int age){
        return service.getByNameAndAge(name,age);
    }

}
