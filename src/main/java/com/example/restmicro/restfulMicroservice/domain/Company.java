package com.example.restmicro.restfulMicroservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Company implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 200)
    private String name;

    @Column(length = 5000)
    private String description;

    @Column
    private Integer year;

    public Company(String name, String description, Integer year) {
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public Company(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
