package by.sergey_l.multithreading.bank;

public class CashBox {
    private String name;
    private int cash;
    private boolean free;

    public int getCash() {
        return cash;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public String getName() {
        return name;
    }

    public void increaseCash(int cash) {
        this.cash += cash;
    }
    public void decreaseCash(int cash) {
        this.cash -= cash;
    }

    public boolean getFree() {
        return free;
    }

    public CashBox(String name, int cash, boolean free) {
        this.name = name;
        this.cash = cash;
        this.free = free;
    }
}
