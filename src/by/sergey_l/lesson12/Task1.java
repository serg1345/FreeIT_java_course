package by.sergey_l.lesson12;

/*
В исходном файле находятся слова, каждое слово на новой строке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
 */

import java.io.*;


public class Task1 {
    static boolean isPalindrome(String word) {
        String reverseWord;
        boolean isPalindrome = false;
        reverseWord = new StringBuilder(word).reverse().toString();
        if ((reverseWord.equalsIgnoreCase(word)) && (word.length() > 2)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br = null;
        FileWriter fw;
        BufferedWriter bw = null;
        try {
            File fileIn = new File("src\\by\\sergey_l\\lesson12\\example.txt");
            fr = new FileReader(fileIn);
            br = new BufferedReader(fr);
            fw = new FileWriter("src\\by\\sergey_l\\lesson12\\output.txt");
            bw = new BufferedWriter(fw);
            String s;
            while ((s = br.readLine()) != null) {
                if (isPalindrome(s)) {
                    bw.write(s + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода: " + e.getMessage());
            }
        }

    }
}
