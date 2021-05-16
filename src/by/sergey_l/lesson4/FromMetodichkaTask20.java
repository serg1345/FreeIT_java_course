package by.sergey_l.lesson4;

/*
Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.
 */
public class FromMetodichkaTask20 {
    public static void main(String[] args) {
        String source = "    Имеется     строка: с текстом. Вывести;   текст, составленный - из последних букв   всех слов.";
        String[] word = source.trim().split("[\\p{Punct}\\s]+");
        String result = "";
        for (int i = 0; i < word.length; i++) {
            result += word[i].charAt(word[i].length() - 1);
        }
        System.out.println(source);
        System.out.println(result);
    }
}
