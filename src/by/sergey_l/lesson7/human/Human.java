package by.sergey_l.lesson7.human;

import by.sergey_l.lesson7.human.jackets.IJacket;
import by.sergey_l.lesson7.human.pants.IPant;
import by.sergey_l.lesson7.human.shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IPant pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPant pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
