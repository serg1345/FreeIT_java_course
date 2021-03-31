package by.sergey_l.lesson4;

import java.io.*;
import java.util.Scanner;

/*
В исходном файле находятся слова, каждое слово на новой строке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
 */
public class String3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("SourceFileForString3.txt");
        Scanner sc = new Scanner(fr);
        FileWriter fw = new FileWriter("OutputFileForString3.txt");
        String line, lineRevers;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
            lineRevers = new StringBuilder(line).reverse().toString();
            if (line.equals(lineRevers)) {
                fw.write(lineRevers + "\n");
            }
        }
        fw.close();
        fr.close();
    }
}
