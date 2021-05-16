package by.sergey_l.lesson7.transport;

import java.util.Scanner;

public class Truck extends Land {
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(int horsepower, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption,
                 int liftingCapacity) {
        super(horsepower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription();
        str += "; грузоподъемность: " + liftingCapacity + "т.";
        return str;
    }

    public void testLiftingCapacity() {
        boolean done = false;
        double weight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вес груза в тоннах >> ");
        while (!done) {
            while (sc.hasNextDouble() == false) {
                System.out.print("Вы ввели не число, повторите >> ");
                sc.next();
            }
            weight = sc.nextDouble();
            if (weight >= 0) {
                done = true;
            } else {
                System.out.print("Вес не может быть отрицательным, повторите >> ");
            }
        }
        if (weight <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
