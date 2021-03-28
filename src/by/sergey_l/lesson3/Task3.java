package by.sergey_l.lesson3;

/*
Вычислить: 1+2+4+8+...+256
 */
public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 8; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println("Искомая сумма равна " + sum);
    }
}
