package by.sergey_l.homework_24_03;

/*
Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение
 */

import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {
        boolean done;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size;

        done = false;
        size = 0;
        System.out.print("Введите целое положительное четное число >> ");
        while (!done) {
            while (sc.hasNextInt() == false) {
                System.out.print("Ваш ввод не соответствует указанным требованиям, повторите >> ");
                sc.next();
            }
            size = sc.nextInt();
            if ((size > 0) && (size % 2 == 0)) {
                done = true;
            } else {
                System.out.print("Ваш ввод не соответствует указанным требованиям, повторите >> ");
            }
        }

        int[] array = new int[size];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 16);
            if (i < size / 2) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (sum1 == sum2) {
            System.out.println("Суммы элементов обоих половин массива равны");
        } else if (sum1 > sum2) {
            System.out.printf("Сумма первой половины элементов (%d) больше суммы второй половины элементов (%d)\n", sum1, sum2);
        } else {
            System.out.printf("Сумма первой половины элементов (%d) меньше суммы второй половины элементов (%d)\n", sum1, sum2);
        }

//доп задание:
//Найти наименьший элемент среди элементов с четными индексами массива
        int min = array[0];
        for (int i = 2; i < array.length; i +=2) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Наименьший элемент с четным индексом равен " + min);
    }
}
