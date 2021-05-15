package by.sergey_l.multithreading.bank;

import java.util.TimerTask;

public class Control extends TimerTask {
    private Bank bank;

    public Control(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        CashBox[] cashBoxes = bank.getCashBoxes();
        for (CashBox elem: cashBoxes) {
            if (elem.getCash() > bank.MAX_LIMIT_CASH) {
                int delta = elem.getCash() - bank.MAX_LIMIT_CASH / 2;
                elem.decreaseCash(delta);
                bank.increaseStorage(delta);
                System.out.println("************ из " + elem.getName() + " в хранилище перемещено: " + delta + " рублей");
            }
            if (elem.getCash() < bank.MIN_LIMIT_CASH) {
                int delta = bank.MAX_LIMIT_CASH / 2 - elem.getCash();
                elem.increaseCash(delta);
                bank.decreaseStorage(delta);
                System.out.println("************ в " + elem.getName() + " из хранилища перемещено: " + delta + " рублей");
            }
        }
    }
}
