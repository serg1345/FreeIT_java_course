package by.sergey_l.multithreading.bank;

public class Bank {
    private int storage;
    private int numberCashbox;
    public final int MAX_LIMIT_CASH = 3_000_000;
    public final int MIN_LIMIT_CASH = 1_000_000;
    private CashBox[] cashBoxes;

    public CashBox[] getCashBoxes() {
        return cashBoxes;
    }
    public CashBox getFreeCashbox(){
        for (CashBox elem: cashBoxes) {
            if (elem.getFree()) {
                elem.setFree(false);
                return elem;
            }
        }
        return null;
    }
    public int getNumberCashbox() {
        return numberCashbox;
    }

    public void increaseStorage(int cash) {
        this.storage += cash;
    }
    public void decreaseStorage(int cash) {
        if (storage >= cash) {
            storage -= cash;
        } else {
            System.out.println("В хранилище недостаточно средств для пополнения кассы");
        }
    }

    public Bank(int storage, int numberCashbox) {
        this.storage = storage;
        this.numberCashbox = numberCashbox;
        cashBoxes = new CashBox[numberCashbox];
        for (int i = 0; i < numberCashbox; i++) {
            cashBoxes[i] = new CashBox("касса_" + (i+1), MAX_LIMIT_CASH / 2, true);
        }
    }
}
