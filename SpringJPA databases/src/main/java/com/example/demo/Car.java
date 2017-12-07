package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Mantas_MSI on 22-Nov-17.
 */

@Entity
public class Car {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String color;
    private String numberPlate;
    private String model;
    private String mark;

    //getters
    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
