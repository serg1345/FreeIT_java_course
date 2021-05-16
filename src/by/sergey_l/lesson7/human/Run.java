package by.sergey_l.lesson7.human;

import by.sergey_l.lesson7.human.jackets.SummerJacket;
import by.sergey_l.lesson7.human.pants.Jeans;
import by.sergey_l.lesson7.human.shoes.RedBoots;

public class Run {
    public static void main(String[] args) {
        Human human = new Human("Alexey", new SummerJacket(), new Jeans(), new RedBoots());
        human.getDressed();
        System.out.println();
        human.undress();
    }
}
