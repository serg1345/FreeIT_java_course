package by.sergey_l.lesson7.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
