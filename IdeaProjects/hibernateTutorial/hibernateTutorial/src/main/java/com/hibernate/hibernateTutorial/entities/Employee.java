package com.hibernate.hibernateTutorial.entities;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private int age;
    private String location;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
