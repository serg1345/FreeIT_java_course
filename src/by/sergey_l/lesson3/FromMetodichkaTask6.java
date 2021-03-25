package by.sergey_l.lesson3;

/*
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */

public class FromMetodichkaTask6 {

    public static void main(String[] args) {
        int number = -365; //здесь хардкодим данное число
        String s1 = "";

        if ((Math.abs(number) / 100 > 0) && (Math.abs(number) / 1000 == 0)) {
            s1 = " является ";
        } else {
            s1 = " не является ";
        }
        System.out.println("Число " + number + s1 + "трехзначным");

        if (Math.abs(number) % 10 == 7) {
            s1 = " является ";
        } else {
            s1 = " не является ";
        }
        System.out.println("Последняя цифра числа " + number + s1 + "7");

        if (number % 2 == 0) {
            s1 = " является ";
        } else {
            s1 = " не является ";
        }
        System.out.println("Число " + number + s1 + "четным");
    }
}
