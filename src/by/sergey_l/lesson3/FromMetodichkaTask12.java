package by.sergey_l.lesson3;

/*
Найдите сумму первых n целых чисел, которые делятся на 3.
 */

public class FromMetodichkaTask12 {

    public static void main(String[] args) {
        int n = 5;

        int sum = 0;
        int i = 1;
        do {
            sum += i * 3;
            i++;
        } while (i <= n);
        System.out.println("Сумма первых " + n + " чисел которые делятся на 3 равна " + sum);
    }
}
