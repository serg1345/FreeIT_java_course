package by.sergey_l.lesson12;

/*
Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.

 */

import java.io.*;
import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\by\\sergey_l\\lesson12\\sourceText.txt");
        String readedText = "";
        int s;
        while ((s = fr.read()) != -1) {
            readedText += (char) s;
        }
        fr.close();
        fr = new FileReader("src\\by\\sergey_l\\lesson12\\censoredWords.txt");
        HashSet<String> censoredWords = new HashSet<String>();
        String censoredWord = "";
        while ((s = fr.read()) != -1) {
            if ((char) s != ',') {
                censoredWord += (char) s;
            } else {
                censoredWords.add(censoredWord);
                censoredWord = "";
            }
        }
        censoredWords.add(censoredWord);
        fr.close();
        int censoredSentence = 0;
        String[] sentences = readedText.split("[.!?]\\s*");
        for (String sentence: sentences) {
            String[] words = sentence.split("[\\p{Punct}\\s]+");
            for (String word: words) {
                if (censoredWords.contains(word.toLowerCase())) {
                    System.out.println("Предложение: \""+sentence + "\" содержит недопустимое слово.");
                    censoredSentence++;
                }
            }
        }
        if (censoredSentence == 0) {
            System.out.println("Исходный текст прошел цензуру");
        } else {
            System.out.println("Количество предложений не прошедших цензуру равно " +censoredSentence);
        }
    }
}
