package by.sergey_l.homework_24_03;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
 */


public class Arrays3 {

    public static void main(String[] args) {

        final int SIZE = 15;
        int numberOfEven = 0;
        int[] array = new int[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numberOfEven++;
            }
        }
        System.out.printf("Количество четных элементов равно %d\n", numberOfEven);

// доп задание:
// Найти средне арифметическое элементов массива, превосходящих некоторое число С.
        int c = 45;
        int countElements = 0;
        int sumElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                countElements++;
                sumElements += array[i];
            }
        }
        if (countElements > 0) {
            System.out.printf("среднее арифметическое элементов массива, превосходящих число %d равно %.3f", c, sumElements / (double) countElements);
        }
    }
}
