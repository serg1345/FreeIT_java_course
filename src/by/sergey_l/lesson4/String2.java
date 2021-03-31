package by.sergey_l.lesson4;

/*
Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
позиции (0)
 */
public class String2 {
    public static void main(String[] args) {
        String sourceString = "I work with strings. I like programming";
        System.out.println("Исходная строка: " + sourceString);
        char in0 = sourceString.charAt(0);
        char in3 = sourceString.charAt(3);
        String resultString = sourceString.replace(in3,in0);
        System.out.println("Результат: " + resultString);
    }
}
