package by.sergey_l.multithreading.parking;

import java.util.concurrent.Semaphore;

public class Parking {
    private static int parkingPLaces = 5;

    public static int getParkingPLaces() {
        return parkingPLaces;
    }

    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(getParkingPLaces());
        Car car;
        for (int i = 1; i <= 20; i++) {
            car = new Car("Car_" + i, sem);
            car.start();
            Thread.sleep(300); // машины на паркинг приезжают не одновременно, а с интервалом.
        }
    }
}
