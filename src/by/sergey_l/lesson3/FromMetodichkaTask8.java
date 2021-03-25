package by.sergey_l.lesson3;

/*
Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
 */

import java.util.Random;

public class FromMetodichkaTask8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();

        String s1 = " рубль";
        String s2 = " рубля";
        String s3 = " рублей";

        System.out.print(x);
        if (x < 0) {
            x = -x;
        }
        switch (x % 10) {
            case 1: {
                if (x % 100 == 11) {
                    System.out.println(s3);
                } else {
                    System.out.println(s1);
                }
                break;
            }
            case 2:
            case 3:
            case 4: {
                if ((x % 100 == 12) || (x % 100 == 13) ||
                        (x % 100 == 13) || (x % 100 == 14)) {
                    System.out.println(s3);
                } else {
                    System.out.println(s2);
                }
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0: {
                System.out.println(s3);
                break;
            }
        }
    }
}
