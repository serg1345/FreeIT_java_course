package by.sergey_l.lesson3;

/*
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
public class FromMetodichkaTask10 {
    public static void main(String[] args) {
        for (int i = 10; i <= 15; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "! = " + factorial);
        }
    }
}
