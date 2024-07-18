package com.mohitaryanproject.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomJPARepo extends JpaRepository<Employee,Integer> {

    public Employee findByName(String name);

    public Employee  findByNameAndAge(String name,int age);
}
