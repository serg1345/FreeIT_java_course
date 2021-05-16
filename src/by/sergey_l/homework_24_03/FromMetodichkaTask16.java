package by.sergey_l.homework_24_03;

/*
Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.
 */
public class FromMetodichkaTask16 {
    public static void main(String[] args) {
        final int SIZE = 10;
        double[] array = new double[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 50;
        }
        for (double element : array) {
            System.out.printf("%.2f  ", element);
        }
        System.out.println();
        int indexMinValue = 0;
        int indexMaxValue = 0;
        double minValue = array[0];
        double maxValue = array[0];
        double sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                indexMinValue = i;
            } else if (array[i] > maxValue) {
                maxValue = array[i];
                indexMaxValue = i;
            }
        }
        if ((indexMaxValue - indexMinValue) > 1) {
            for (int i = indexMinValue + 1; i < indexMaxValue; i++) {
                sum += array[i];
            }
        } else if ((indexMinValue - indexMaxValue) > 1) {
            for (int i = indexMaxValue + 1; i < indexMinValue; i++) {
                sum += array[i];
            }
        }
        System.out.printf("Cумма элементов между минимальным и максимальным значениями равна %.2f", sum);
    }
}