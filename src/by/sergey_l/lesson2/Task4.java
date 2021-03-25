package by.sergey_l.lesson2;

/*
Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 0;

        int countPositive = 0;

        if (a > 0) {
            countPositive++;
        }
        if (b > 0) {
            countPositive++;
        }
        if (c > 0) {
            countPositive++;
        }
        System.out.printf("из чисел %d, %d, %d - %d положительных", a, b,c, countPositive);
    }
}
