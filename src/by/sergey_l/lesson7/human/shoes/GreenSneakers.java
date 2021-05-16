package by.sergey_l.lesson7.human.shoes;

public class GreenSneakers implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Зеленые кросовки одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Зеленые кросовки сняты");
    }
}
