package by.sergey_l.lesson3;

/*
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class FromMetodichkaTask7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int r = 5;
        double diagonal = 0;

        diagonal = Math.sqrt(a * a + b * b);
        if (diagonal <= 2 * r) {
            System.out.println("Данное отверстие можно полностью закрыть картонкой данного радиуса");
        } else {
            System.out.println("Данное отверстие нельзя полностью закрыть картонкой данного радиуса");
        }

    }
}
