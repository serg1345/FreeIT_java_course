package by.sergey_l.homework_24_03;

import java.util.Scanner;

/*
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
 */
public class MultiArray4 {
    public static void main(String[] args) {
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        int size = 0;

        System.out.print("Введите размер матрицы >> ");
        while (!done) {
            while (sc.hasNextInt() == false) {
                System.out.print("Ваш ввод не корректен, повторите >> ");
                sc.next();
            }
            size = sc.nextInt();
            if (size > 1) {
                done = true;
            } else {
                System.out.print("Ваш ввод не корректен, повторите >> ");
            }
        }
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(array[i][j] + "  ");
                if (array[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1 - i; j++) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов над побочной диагональю равна " + sum);
    }
}