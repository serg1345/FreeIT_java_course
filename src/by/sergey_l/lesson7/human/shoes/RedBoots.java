package by.sergey_l.lesson7.human.shoes;

public class RedBoots implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Красные ботинки одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Красные ботинки сняты");
    }
}
