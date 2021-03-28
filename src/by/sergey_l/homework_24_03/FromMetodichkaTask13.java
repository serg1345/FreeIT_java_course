package by.sergey_l.homework_24_03;

/*
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.
 */

public class FromMetodichkaTask13 {
    public static void main(String[] args) {

        final int SIZE = 20;
        int[] array = new int[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        for (int element : array) {
            System.out.print(element + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nМаксимальный элемент равен " + max);
    }
}
