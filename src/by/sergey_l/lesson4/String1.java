package by.sergey_l.lesson4;

/*
Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
последнего вхождения сивола(B).
 */
public class String1 {
    public static void main(String[] args) {
        String sourceString = "qweerAdpjbB $gifo B lsvsA";
        System.out.println("Исходная строка: " + sourceString);
        int index1 = sourceString.indexOf('A');
        int index2 = sourceString.lastIndexOf('B');
        if ((index1 == -1) || (index2 == -1) || (index1 > index2)) {
            System.out.println("Искомой подстроки в исходной строке не существует");
        } else {
            String subString = sourceString.substring(index1, index2);
            System.out.println("Искомая подстрока: " + subString);
        }
    }
}
