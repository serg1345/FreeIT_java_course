package by.sergey_l.lesson7.transport;

import java.util.Scanner;

public class PassengerCar extends Land {
    private int passengerCapacity;
    private String bodyType;

    public PassengerCar() {
    }

    public PassengerCar(int horsepower, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption,
                        int passengerCapacity, String bodyType) {
        super(horsepower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
        this.bodyType = bodyType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription();
        str += "; к-во пассажиров: " + passengerCapacity;
        str += "; кузов: " + bodyType + ".";
        return str;
    }

    public void printEstimation() {
        boolean done = false;
        double time = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите продолжительность поездки >> ");
        while (!done) {
            while (sc.hasNextDouble() == false) {
                System.out.print("Вы ввели не число, повторите >> ");
                sc.next();
            }
            time = sc.nextDouble();
            if (time >= 0) {
                done = true;
            } else {
                System.out.print("Продолжительность поездки не может быть отрицательной, повторите >> ");
            }
        }
        System.out.printf("За %.2f часа автомобиль %s, двигаясь с максимальной скоростью %dкм/ч, израсходует %.2f литров " +
                "топлива\n", time, getBrand(), getMaxSpeed(), getAmonuntFuel(time));
    }

    private double getAmonuntFuel(double time) {
        return time * getMaxSpeed() * getFuelConsumption() / 100;
    }
}
