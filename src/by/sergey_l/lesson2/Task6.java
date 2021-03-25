package by.sergey_l.lesson2;

/*
Даны 2 числа. Вывести большее из них
 */

public class Task6 {

    public static void main(String[] args) {
        double number1 = 3.3;
        double number2 = -2.5;

        if (number1 == number2) {
            System.out.println("невозможно определить большее число так как они равны");
        } else {
            System.out.println("Из чисел " + number1 + " и " + number2 + " большее равно " + ((number1 > number2) ? number1 : number2));
        }
    }


}
