package com.learn.spring;

public class Car {
    private String brand;
    private String area;
    private double price;
    private int speed;

    public Car(String brand, String area, double price) {
        this.brand = brand;
        this.area = area;
        this.price = price;
    }

    public Car(String brand, String area, int speed) {
        this.brand = brand;
        this.area = area;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", area='" + area + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
