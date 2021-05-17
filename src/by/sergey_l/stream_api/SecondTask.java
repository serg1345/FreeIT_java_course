package by.sergey_l.stream_api;

import java.util.Arrays;
import java.util.Comparator;


/*
Задать массив строк. Используя средства Stream API отсортировать строки в
лексикографическом порядке по возрастанию и убыванию
 */
public class SecondTask {
    public static void main(String[] args) {
        String[] strings = {"Сидоров", "Иванов", "Петров", "Козлов"};
        strings = Arrays.stream(strings).sorted(Comparator.naturalOrder()).toArray(String[]::new);
        System.out.println(Arrays.asList(strings));
        strings = Arrays.stream(strings).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        System.out.println(Arrays.asList(strings));
    }
}
