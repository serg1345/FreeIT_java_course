package by.sergey_l.multithreading.bank;

import java.util.concurrent.Semaphore;

public class Client extends Thread {
    private String name;
    private Semaphore sem;
    private Bank bank;
    private CashBox cashBox;
    private int bankAccount = (int) (Math.random() * 1_000_000);

    public Client(String name, Semaphore sem, Bank bank) {
        this.name = name;
        this.sem = sem;
        this.bank = bank;
    }
    private void addToAccount(int sum) {
        bankAccount += sum;
        cashBox.increaseCash(sum);
        System.out.println(name + " положил на счет " + sum + " рублей.");
    }

    private  void takeFromAccount(int sum) {
        if (bankAccount >= sum) {
            if (cashBox.getCash() >= sum) {
                bankAccount -= sum;
                cashBox.decreaseCash(sum);
                System.out.println(name + " снял со счета " + sum + " рублей.");
            } else {
                System.out.println("**************Недостаточно наличных в кассе для операции***************");
            }
        } else {
            System.out.println(name + ": Недостаточно средств на счете для операции");
        }
    }
    @Override
    public void run() {
        try {
            sem.acquire();
            cashBox = bank.getFreeCashbox();
            System.out.println(name + " прошел в " + cashBox.getName());
            sleep((int) (Math.random() * 5000));
            int operation = (int) (Math.random() * 2);
            switch (operation) {
                case 0:{
                    addToAccount((int) (Math.random() * 1_000_000));
                    break;
                }
                case 1:{
                    takeFromAccount((int) (Math.random() * 1_000_000));
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(name + " освободил " + cashBox.getName());
            cashBox.setFree(true);
            cashBox = null;
            sem.release();
        }
    }
}
