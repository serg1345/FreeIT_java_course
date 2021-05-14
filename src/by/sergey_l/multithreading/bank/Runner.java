package by.sergey_l.multithreading.bank;

import java.util.Timer;
import java.util.concurrent.Semaphore;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Bank myBank = new Bank(1_000_000_000, 5);
        Timer timer = new Timer();
        timer.schedule(new Control(myBank), 0, 1000);
        Semaphore cashiers = new Semaphore(myBank.getNumberCashbox());
        Client client;
        for (int i = 1; i <= 30; i++) {
            client = new Client("Клиент_" + i, cashiers, myBank);
            client.start();
            Thread.sleep(100);
        }
        while (Thread.activeCount() > 3) {
            Thread.sleep(2000);
        }
        timer.cancel();
        System.out.println("Банковский день завершен.");
    }
}
