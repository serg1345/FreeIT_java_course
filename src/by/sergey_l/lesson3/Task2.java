package by.sergey_l.lesson3;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
пределить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

 */

public class Task2 {

    public static void main(String[] args) {
        int qntAmoebas = 1;

        for (int i = 3; i <= 24; i +=3) {
            System.out.printf("Через %d часа(ов) будет %d амёб(ы)\n", i, qntAmoebas *= 2);
        }
    }
}
