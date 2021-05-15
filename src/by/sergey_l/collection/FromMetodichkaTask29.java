package by.sergey_l.collection;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;

public class FromMetodichkaTask29 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            grades.add((int) (Math.random() * 5 + 1));
        }
        System.out.println("Исходные оценки: " + grades);
        grades.removeIf(grade -> grade < 3);
        System.out.println("Оценки после обработки: " + grades);
    }
}
