package by.sergey_l.multithreading.parking;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {
    private String name;
    private Semaphore sem;

    public Car(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        try {
            if (sem.tryAcquire(500, TimeUnit.MILLISECONDS)) {
                int parkingTime = (int) (Math.random() * 4000) + 1000;
                System.out.println(name + " припарковался на " + parkingTime / 1000.0 + " секунд");
                sleep(parkingTime);
                System.out.println(name + " освобождает место");
                sem.release();
            } else {
                System.out.println(name + " недождался и уехал");
            }
        } catch (InterruptedException e) {
            System.out.println("исключение");
        }
    }
}
