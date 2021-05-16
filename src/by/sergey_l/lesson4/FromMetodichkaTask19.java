package by.sergey_l.lesson4;

/*
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.
 */
public class FromMetodichkaTask19 {
    public static void main(String[] args) {
        String source = "       Имеется      строка      с текстом. Подсчитать количество слов в тексте.            ";
        String[] word = source.trim().split("\\s+");
        System.out.println("Количество слов в тексте равно " + word.length);
    }
}
