package by.sergey_l.lesson3;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class Task1 {

    public static void main(String[] args) {
        double sum = 0;
        double dictancePerDay = 10;

        for (int i = 1; i <= 7; i++) {
            sum += dictancePerDay;
            dictancePerDay *= 1.1;
        }

        System.out.printf("За 7 дней спортсмен пробежит %.2f километров.", sum);

    }
}
