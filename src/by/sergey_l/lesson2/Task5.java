package by.sergey_l.lesson2;

/*
Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class Task5 {
    public static void main(String[] args) {
        int a = -5;
        int b = 7;
        int c = 0;
        int countPositive = 0;
        int countNegative = 0;
        if (a > 0) {
            countPositive++;
        } else if (a < 0) {
            countNegative++;
        }
        if (b > 0) {
            countPositive++;
        } else if (b < 0) {
            countNegative++;
        }
        if (c > 0) {
            countPositive++;
        } else if (c < 0) {
            countNegative++;
        }
        System.out.printf("из чисел %d, %d, %d - %d положительных и %d отрицательных", a, b, c, countPositive, countNegative);
    }
}
