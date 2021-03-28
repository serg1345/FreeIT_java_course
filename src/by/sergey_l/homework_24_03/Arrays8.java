package by.sergey_l.homework_24_03;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.
*/
public class Arrays8 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];
        double[] array3 = new double[SIZE];
        int countOfInteger = 0;
        for (int i = 0; i < SIZE; i++) {
            array1[i] = (int) (Math.random() * 10);
            array2[i] = (int) (Math.random() * 10);
            array3[i] = (double) array1[i] / array2[i];
            if ((array2[i] != 0) && (array3[i] == array1[i] / array2[i])) {
                countOfInteger++;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%.2f\t", array3[i]);
        }
        System.out.println();
        System.out.println("Количество целых элементов в третьем массиве равно " + countOfInteger);
//доп задание:
// Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
        double max = array3[0];
        double previousMax = 0;
        for (int i = 1; i < array3.length; i++) {
            if ((array3[i] > previousMax) && (array3[i] < max)) {
                previousMax = array3[i];
            } else if (array3[i] > max) {
                previousMax = max;
                max = array3[i];
            }
        }
        System.out.println("Второй по величине элемент равен " + String.format("%.2f", previousMax));
    }
}