package com.mohitaryanproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@org.springframework.stereotype.Service("myservice")
public class Service {

    @Autowired
    Repository repo  ;

    public User insertUser(User user){

        return repo.insertUser(user);
    }

    public User getUser(int id){
        return repo.getUser(id);
    }


    public User updateUser(int id,String address){
        return repo.updateUser(id, address);
    }


    public String deleteUser( int id){
        return repo.deleteUser(id);
    }

    public Map<Integer, User> getDb() {
        return repo.getDb();
    }

}
