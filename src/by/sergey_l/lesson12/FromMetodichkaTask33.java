package by.sergey_l.lesson12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Arrays;

/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 */
public class FromMetodichkaTask33 {
    public static void main(String[] args) throws IOException {
        String text = "Массив - это структура данных, в которой хранятся элементы одного типа. Его можно представить, " +
                "как набор пронумерованных ячеек, в каждую из которых можно поместить какие—то данные (один элемент " +
                "данных в одну ячейку). Доступ к конкретной ячейке осуществляется через её номер. Номер элемента в " +
                "массиве также называют индексом!";
        FileWriter fw = new FileWriter("src\\by\\sergey_l\\lesson12\\source.txt");
        fw.write(text);
        fw.close();
        HashSet<Character> punctuationMarks = new HashSet<Character>(Arrays.asList('.', ',', '!', '-', '?', ';', ':'));
        FileReader fr = new FileReader("src\\by\\sergey_l\\lesson12\\source.txt");
        String readedText = "";
        int countPunctuationMarks = 0;
        int s;
        while ((s = fr.read()) != -1) {
            if (punctuationMarks.contains((char) s)) {
                countPunctuationMarks++;
            }
            readedText += (char) s;
        }
        fr.close();
        System.out.println("В исходном тексте количество знаков препинания равно " + countPunctuationMarks);
        String[] words = readedText.split("[\\p{Punct}\\s]+");
        System.out.println("Количество слов в исходном тексте равно " + words.length);
    }
}
