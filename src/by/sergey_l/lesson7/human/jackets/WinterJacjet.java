package by.sergey_l.lesson7.human.jackets;

public class WinterJacjet implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Зимняя куртка одета");
    }

    @Override
    public void takeOff() {
        System.out.println("Зимняя куртка снята");
    }
}
