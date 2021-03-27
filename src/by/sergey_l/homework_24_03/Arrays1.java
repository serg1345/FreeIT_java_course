package by.sergey_l.homework_24_03;

/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
 */

public class Arrays1 {
    public static void main(String[] args) {

        int arrayEven[] = new int[10];

        for (int i = 1; i <= arrayEven.length; i++) {
            arrayEven[i - 1] = i * 2;
        }

        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayEven.length; i++) {
            System.out.println(arrayEven[i]);
        }

// доп задание:
// Найти произведение элементов, кратных 3.
        boolean isMultipleThree = false;
        int productOfNumber = 1;
        for (int i = 0; i < arrayEven.length; i++) {
            if (arrayEven[i] % 3 == 0) {
                isMultipleThree = true;
                productOfNumber *= arrayEven[i];
            }
        }
        if (isMultipleThree) {
            System.out.println("Произведение элементов массива кратных 3 равно " + productOfNumber);
        }
    }
}
