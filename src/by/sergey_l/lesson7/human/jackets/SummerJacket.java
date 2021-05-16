package by.sergey_l.lesson7.human.jackets;

public class SummerJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Летняя куртка одета");
    }

    @Override
    public void takeOff() {
        System.out.println("Летняя куртка снята");
    }
}
