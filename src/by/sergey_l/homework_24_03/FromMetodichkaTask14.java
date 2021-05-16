package by.sergey_l.homework_24_03;

/*
Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.
 */

import java.util.Random;

public class FromMetodichkaTask14 {
    public static void main(String[] args) {
        final int SIZE = 20;
        int[] grade = new int[SIZE];
        Random rand = new Random();
        int maxValue;
        int minValue;
        for (int i = 0; i < grade.length; i++) {
            grade[i] = rand.nextInt(10) + 1;
        }
        for (int element : grade) {
            System.out.print(element + " ");
        }
        maxValue = grade[0];
        minValue = grade[0];
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > maxValue) {
                maxValue = grade[i];
            }
            if (grade[i] < minValue) {
                minValue = grade[i];
            }
        }
        System.out.printf("\nМаксимальное значение %d, его индексы в массиве: ", maxValue);
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == maxValue) {
                System.out.print(i + ", ");
            }
        }
        System.out.printf("\nМинимальное значение %d, его индексы в массиве: ", minValue);
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == minValue) {
                System.out.print(i + ", ");
            }
        }
    }
}
