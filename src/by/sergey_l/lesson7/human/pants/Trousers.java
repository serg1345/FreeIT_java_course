package by.sergey_l.lesson7.human.pants;

public class Trousers implements IPant{
    @Override
    public void putOn() {
        System.out.println("Брюки одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Брюки сняты");
    }
}
