package by.sergey_l.collection;

/*
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class FromMetodichkaTask31 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            grades.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Исходные оценки: " + grades);
        Iterator it = grades.listIterator();
        int max = 0;
        while (it.hasNext()) {
            int current = (int) it.next();
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Максимальная оценка равна " + max);
    }
}
