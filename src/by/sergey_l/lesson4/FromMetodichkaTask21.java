package by.sergey_l.lesson4;

/*
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
public class FromMetodichkaTask21 {
    public static void main(String[] args) {
        long timeStart;
        long timeEnd;
        String str = "abc";
        StringBuilder str1 = new StringBuilder("abc");
        StringBuffer str2 = new StringBuffer("abc");
        int number = 100000;
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            str += "cde" + i;
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("string выполнен за " + (timeEnd - timeStart) + " мс");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            str1.append("cde" + i);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("stringBuilder выполнен за " + (timeEnd - timeStart) + " мс");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            str2.append("cde" + i);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("stringBuffer выполнен за " + (timeEnd - timeStart) + " мс");
    }
}
