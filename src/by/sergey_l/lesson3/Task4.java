package by.sergey_l.lesson3;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int result = 0;
        System.out.print(a + " * " + b + " = ");
        if ((a == 0) || (b == 0)) { //оба нули
            result = 0;
        } else if (((a < 0) && (b < 0)) || (a > 0) && (b > 0)) { // оба одного знака
            if (a < 0) {
                a = -a;
                b = -b;
            }
            for (int i = 1; i <= b; i++) {
                result += a;
            }
        } else if (a < 0) { // a < 0 и b > 0
            for (int i = -1; i >= a; i--) {
                result -= b;
            }
        } else { //a > 0 и b < 0
            for (int i = 1; i <= a; i++) {
                result += b;
            }
        }
        System.out.println(result);
    }
}
