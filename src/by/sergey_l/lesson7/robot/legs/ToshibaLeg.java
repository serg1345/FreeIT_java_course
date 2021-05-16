package by.sergey_l.lesson7.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba шагнула");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
