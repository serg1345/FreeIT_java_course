package by.sergey_l.homework_24_03;

/*
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
 */
public class FromMetodichkaTask15 {
    public static void main(String[] args) {
        final int SIZE = 20;
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < SIZE / 2; i++) {
            temp = array[i];
            array[i] = array[SIZE - 1 - i];
            array[SIZE - 1 - i] = temp;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
