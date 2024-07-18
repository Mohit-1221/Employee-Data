package com.mohitaryanproject.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository("myrepo")
public class Repository {

    public Map<Integer, User> getDb() {
        return db;
    }

    public void setDb(Map<Integer, User> db) {
        this.db = db;
    }

    private Map<Integer,User> db = new HashMap<>(); //< id , user>

    public User insertUser(User user){

        //operation
        int id = user.getId();
        db.put(id,user);
        return user;
    }

    public User getUser(int id){
        System.out.println("the id is: "+id);
        User user = db.get(id);
        //operation
        return user;
    }


    public User updateUser(int id,String address){
        System.out.println(id+" "+address);
        User user =db.get(id);
        user.setAddress(address);
        db.put(id,user);
        //operation
        return user;
    }


    public String deleteUser( int id){
        System.out.println("id is: "+id);
        db.remove(id);
        //operation
        return "Deleted";
    }

}
