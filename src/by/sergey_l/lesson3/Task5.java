package by.sergey_l.lesson3;

/*
Напишите программу печати таблицы перевода расстояний из дюймов
в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task5 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 20; i++) {
            result += 2.54;
            System.out.printf("%d inch = %.2f cm\n", i, result);
        }
    }
}
