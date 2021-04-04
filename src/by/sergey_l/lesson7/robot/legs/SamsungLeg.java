package by.sergey_l.lesson7.robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung шагнула");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
