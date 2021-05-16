package by.sergey_l.lesson3;
/*
Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
 */

import java.util.Random;

public class FromMetodichkaTask11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100) + 1;
        boolean xIsSimple = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                xIsSimple = false;
                break;
            }
        }
        if (xIsSimple == true) {
            System.out.printf("Число %d является простым", x);
        } else {
            System.out.printf("Число %d не является простым", x);
        }
    }
}
