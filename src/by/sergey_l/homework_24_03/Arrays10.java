package by.sergey_l.homework_24_03;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
 */

import java.util.Scanner;

public class Arrays10 {
    public static void main(String[] args) {
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int numberOfEvenElements = 0;
        System.out.print("Введите целое положительное число, больше чем число 3 >> ");
        while (!done) {
            while (sc.hasNextInt() == false) {
                System.out.print("Ваш ввод не соответствует указанным требованиям, повторите >> ");
                sc.next();
            }
            size = sc.nextInt();
            if (size > 3) {
                done = true;
            } else {
                System.out.print("Ваш ввод не соответствует указанным требованиям, повторите >> ");
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (size + 1));
            if (array[i] % 2 == 0) {
                numberOfEvenElements++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int j = 0;
        int[] arrayEvens = null;
        if (numberOfEvenElements > 0) {
            arrayEvens = new int[numberOfEvenElements];
            for (int i = 0; i < size; i++) {
                if (j == numberOfEvenElements) {
                    break;
                }
                if (array[i] % 2 == 0) {
                    arrayEvens[j] = array[i];
                    j++;
                }
            }
        }
        for (int i = 0; i < arrayEvens.length; i++) {
            System.out.print(arrayEvens[i] + " ");
        }
        System.out.println();
//доп задание:
//Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
        int indexOfMax = 0;
        int max = arrayEvens[0];
        for (int i = 1; i < arrayEvens.length; i++) {
            if (arrayEvens[i] > max) {
                max = arrayEvens[i];
                indexOfMax = i;
            }
        }
        arrayEvens[indexOfMax] = arrayEvens[0];
        arrayEvens[0] = max;
        for (int i = 0; i < arrayEvens.length; i++) {
            System.out.print(arrayEvens[i] + " ");
        }
        System.out.println();
    }
}
