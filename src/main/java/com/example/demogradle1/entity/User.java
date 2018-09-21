package com.example.demogradle1.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Generated(GenerationTime.INSERT)
    private long id;

    private String name;
    private String type;
    private int age;
    private int height;
    private int weight;
    private int BMIindex;
    private String value1;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBMIindex() {
        return BMIindex;
    }
    public void setBMIindex(int BMIindex) {
        this.BMIindex = BMIindex;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
    public String getValue1() {
        return value1;
    }


}