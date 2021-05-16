package by.sergey_l.lesson4;
/*
Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TextFormater {
    static int numberWords(String sentence) {
        String[] words = sentence.split("[\\p{Punct}\\s]+");
        return words.length;
    }

    static boolean isPalindrome(String sentence) {
        String[] words = sentence.split("[\\p{Punct}\\s]+");
        String reverseString;
        boolean isPalindrome = false;
        for (int i = 0; i < words.length; i++) {
            reverseString = new StringBuilder(words[i]).reverse().toString();
            if ((reverseString.equals(words[i])) && (words[i].length() > 2)) {
                isPalindrome = true;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("SourceForTextFormater.txt");
        Scanner sc = new Scanner(fr);
        FileWriter fw = new FileWriter("OutputForTextFormater.txt");
        String StringfromFile = "";
        int i = 0;
        while (sc.hasNextLine()) {
            StringfromFile += sc.nextLine();
        }
        String[] sentence = StringfromFile.split("[.!?]\\s*");
        for (String element : sentence) {
            if ((isPalindrome(element)) || ((numberWords(element) >= 3) && (numberWords(element) < 5))) {
                fw.write(element + "\n");
            }
        }
        System.out.println(sentence.length);
        fr.close();
        fw.close();
    }
}
