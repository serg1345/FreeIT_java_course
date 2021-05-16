package by.sergey_l.homework_24_03;

/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.
*/
public class Arrays7 {
    public static void main(String[] args) {
        final int SIZE = 12;
        int[] array = new int[SIZE];
        int max = Integer.MIN_VALUE;
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
            if (array[i] >= max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Максимальный элемент равен " + max);
        System.out.println("Индекс его последнего вхождения равен " + indexOfMax);
// доп задание:
//	Подсчитать, сколько раз встречается элемент с заданным значением.
        int value = 10;
        int countValue = 0;
        for (int element : array) {
            if (element == value) {
                countValue++;
            }
        }
        System.out.printf("Количество вхождений значения %d равно %d\n", value, countValue);
    }
}