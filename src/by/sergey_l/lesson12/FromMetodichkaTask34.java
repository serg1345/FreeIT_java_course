package by.sergey_l.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
 */
public class FromMetodichkaTask34 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("src\\by\\sergey_l\\lesson12\\sourceForTask34.txt");
        Scanner sc = new Scanner(fr);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            } else {
                sc.next();
            }
        }
        int sum = 0;
        System.out.println("Найденные числа в тексте: ");
        for (int elem : numbers) {
            System.out.println(elem);
            sum += elem;
        }
        System.out.println("Сумма чисел равна: " + sum);
        HashSet<Integer> deletedEquals = new HashSet<>(numbers);
        System.out.println("Список чисел после удаления повторяющихся: ");
        for (int elem : deletedEquals) {
            System.out.println(elem);
        }
    }
}
