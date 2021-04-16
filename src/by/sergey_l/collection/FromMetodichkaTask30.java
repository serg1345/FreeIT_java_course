package by.sergey_l.collection;

import java.util.ArrayList;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
 */
public class FromMetodichkaTask30 {
    public static void main(String[] args) {
        int size = 20;
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            randoms.add((int) (Math.random() * 10));
        }
        System.out.println("Исходная коллекция: " + randoms);
        for (int i = 0; i < randoms.size(); i++) {
            for (int j = i + 1; j < randoms.size(); j++) {
               if (randoms.get(i).equals(randoms.get(j))) {
                   randoms.remove(j);
                   j--;
               }
            }
        }
        System.out.println("Результат: " + randoms);
    }
}
