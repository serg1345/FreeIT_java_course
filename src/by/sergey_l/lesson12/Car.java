package by.sergey_l.lesson12;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int price;
    private int maxSpeed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int price, int maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Марка: " + brand + "; цена: " + price + "; макс. скорость: " + maxSpeed;
    }
}
