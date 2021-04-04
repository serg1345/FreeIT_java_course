package by.sergey_l.lesson7.human.pants;

public class Jeans implements IPant {
    @Override
    public void putOn() {
        System.out.println("Джинсы одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Джинсы сняты");
    }
}
