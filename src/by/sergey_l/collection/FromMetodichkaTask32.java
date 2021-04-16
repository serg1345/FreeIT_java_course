package by.sergey_l.collection;

/*
Имеется текст. Следует составить для него частотный словарь.
 */

import java.util.HashMap;

public class FromMetodichkaTask32 {
    public static void main(String[] args) {
        String text = "Говорил попугай попугаю:\n" +
                "Я тебя, попугай, попугаю.\n" +
                "Отвечает ему попугай:\n" +
                "Попугай, попугай, попугай!";
        String[] words = text.split("[\\p{Punct}\\s]+");
        HashMap<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if (!dictionary.containsKey(words[i])) {
                dictionary.put(words[i], 1);
            } else {
                dictionary.put(words[i], dictionary.get(words[i]) + 1);
            }
        }
        System.out.println(dictionary);
    }
}
