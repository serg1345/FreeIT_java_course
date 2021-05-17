package by.sergey_l.stream_api;

/*
Задать массив чисел. Используя средства Stream API вывести на консоль нечетные
значения
 */

import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int[] values = {2, 5, 67, 28, 14, 33, 0, 15, 20};
        Arrays.stream(values).filter(x -> (x % 2 != 0)).forEach(System.out::println);
    }
}
