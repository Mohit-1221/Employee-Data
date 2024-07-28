package com.mohitaryanproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Optional;

@Service
public class CustomService {

    @Autowired
    CustomJPARepo repo;
    public Employee saveEmployee(Integer id, String name, Integer age){

       Employee employee = new Employee();
       employee.setId(id);
       employee.setName(name);
       employee.setAge(age);

       Employee savedEmployee = repo.save(employee);

        return savedEmployee;
    }

    public Employee getEmployeeById(int id)  {
        Optional<Employee> optionalEmployee = repo.findById(id);
        Employee employee = null;
        if(optionalEmployee.isPresent()){
            System.out.println("Object exits");
            employee = optionalEmployee.get();
        }
        if (optionalEmployee.isEmpty()){
            System.out.println("Object does not exist");
            employee =null;
        }
        return  employee;
    }

    public Employee updateEmployee(int id, String name,int age){
        Employee employee= getEmployeeById(id);
        Employee updateEmployee = null;
        if(employee != null){
            employee.setName(name);
            employee.setAge(age);
            updateEmployee = repo.save(employee);
        }

        return  updateEmployee;

    }

    public String deleteEmployeeById( int id){
        Employee employee= getEmployeeById(id);
        if(employee != null){
            repo.deleteById(id);
            return "Deleted Successfully";
        }

        return "Delete Failed";
    }

    public Employee getByName(String name){
        Employee employee = repo.findByName(name);
        return employee;
    }
    public Employee getByNameAndAge(@RequestParam String name,@RequestParam int age){
        return repo.findByNameAndAge(name,age);
    }

}

