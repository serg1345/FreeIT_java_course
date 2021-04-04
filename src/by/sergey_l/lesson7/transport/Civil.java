package by.sergey_l.lesson7.transport;

import java.util.Scanner;

public class Civil extends Air {
    private int passengerCapacity;
    private boolean businessClass;

    public Civil() {
    }

    public Civil(int horsepower, int maxSpeed, int weight, String brand, double wingspan, int minRunwayLength,
                 int passengerCapacity, boolean businessClass) {
        super(horsepower, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.passengerCapacity = passengerCapacity;
        this.businessClass = businessClass;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription();
        str += "; к-во пассажиров: " + passengerCapacity;
        str += "; наличие бизнес класса: " + ((businessClass) ? "есть." : "нет.");
        return str;
    }

    public void testPassengerCapacity() {
        boolean done = false;
        int numberPassengers = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество пассажиров >> ");
        while (!done) {
            while (sc.hasNextInt() == false) {
                System.out.print("Вы ввели не число, повторите >> ");
                sc.next();
            }
            numberPassengers = sc.nextInt();
            if (numberPassengers >= 0) {
                done = true;
            } else {
                System.out.print("Количество пассажиров не может быть отрицательным, повторите >> ");
            }
        }
        if (numberPassengers <= passengerCapacity) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
