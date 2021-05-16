package by.sergey_l.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
 */
public class FromMetodichkaTask22 {
    public static void main(String[] args) {
        String source = "0x7FFFbgve,754tyg7640X6F 1x4640;00xaF45Dc";
        Pattern hex = Pattern.compile("0[xX][0-9A-Fa-f]+");
        Matcher matcher = hex.matcher(source);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
