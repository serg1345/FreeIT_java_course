package by.sergey_l.stream_api;

/*
Задать массив строк. Используя средства Stream API определить количество
уникальных значений.
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        String[] strings = {"Сидоров", "Иванов", "Петров", "Козлов", "Петров", "Козлов", "Козлов"};
        int size = Arrays.stream(strings).collect(Collectors.toSet()).size();
        System.out.println("Количество уникальных элементов в исходном массиве равно " + size);
    }
}
