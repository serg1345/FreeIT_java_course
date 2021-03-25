package by.sergey_l.lesson2;

/*
В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и
положительное оно или отрицательное. Например, "это однозначное положительное число".
Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.
 */
public class Task1 {

    public static void main(String[] args) {
        int number = 21;
        String countDigit = "";
        String negsiveOrPositive = "";

        if (number == 0) {
            System.out.println("Число " + number + " однозначное не является ни положительным ни отрицательным.");
            return;
        }

        if (number < 0) {
            negsiveOrPositive = " отрицательное";
        } else {
            negsiveOrPositive = " положительное";
        }

        if (Math.abs(number) / 100 > 0) {
            countDigit = " трехзначное (или более)";
        } else if (Math.abs(number) / 10 > 0) {
            countDigit = " двухзначное";
        } else {
            countDigit = " однозначное";
        }

        System.out.println("Число " + number + countDigit + negsiveOrPositive + " число.");

    }
}
