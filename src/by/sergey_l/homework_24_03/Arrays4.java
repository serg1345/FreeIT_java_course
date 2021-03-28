package by.sergey_l.homework_24_03;

/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
 */
public class Arrays4 {
    public static void main(String[] args) {
        final int SIZE = 20;
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//доп задание:
//Найти наименьший нечетный элемент.
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i += 2) {
            if ((array[i] % 2 != 0) && (array[i] < minOdd)) {
                minOdd = array[i];
            }
        }
        if (minOdd == Integer.MAX_VALUE) {
            System.out.println("В массиве нет нечетных элементов");
        } else {
            System.out.printf("Наименьший нечетный элемент равен %d\n", minOdd);
        }
    }
}