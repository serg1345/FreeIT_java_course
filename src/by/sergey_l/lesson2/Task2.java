package by.sergey_l.lesson2;

/*
Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int c = 7;
        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {
            System.out.println("Треугольника с такими сторонами не существует");
        } else {
            System.out.println("Такой треугольник существует");
        }
    }
}
