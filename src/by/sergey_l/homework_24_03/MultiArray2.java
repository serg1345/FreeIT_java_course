package by.sergey_l.homework_24_03;

import java.util.Scanner;

/*
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Вывести нечетные элементы находящиеся под главной диагональю(включительно).
 */
public class MultiArray2 {
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
        System.out.println("********************************************");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i ; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print("-   ");
                } else {
                    System.out.print(array[i][j] + "  ");
                    if (array[i][j] < 10) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

