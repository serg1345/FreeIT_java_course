package by.sergey_l.lesson12;

import java.io.*;

/*
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */
public class FromMetodichkaTask35 {
    public static void main(String[] args) throws IOException {
        String file = "src\\by\\sergey_l\\lesson12\\file.dat";
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        for (int i = 0; i < 20; i++) {
            dos.writeInt((int) (Math.random() * 20));
        }
        dos.close();
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        int number;
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            number = dis.readInt();
            sum += number;
            System.out.print(number + ", ");
        }
        System.out.println("\nСреднее арифметическое равно: " + sum / 20.0);
    }
}
