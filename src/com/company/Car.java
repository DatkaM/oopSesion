package com.company;

public class Car {
    String name;
    String model;
    String color;
    int speed;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }

    void chekSpped(int speed) {
        if (speed <= 30) {
            System.out.println("too slow");
        } else if (speed > 110) {
            System.out.println("too fast");
        } else/* if (speed >= 30 && speed < 110) */{
            System.out.println("You are good at driving");
        }
    }
}


