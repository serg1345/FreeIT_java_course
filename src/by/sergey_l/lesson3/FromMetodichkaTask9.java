package by.sergey_l.lesson3;

/*
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */

public class FromMetodichkaTask9 {
    public static void main(String[] args) {
        // пример с суммой, о котором говорится в условии в методичке не нашел, поэтому просто посчитаю факториалы.
        long factorial = 1;
        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("%d! = %d\n",i,factorial);
        }
    }
}
