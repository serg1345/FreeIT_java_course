package by.sergey_l.date;

/*
Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss
решается двумя способами, используя библиотеку java.util и java.time
 */

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        outputDateOldMethod();
        System.out.println("****************");
        outputDateNewMethod();
    }

    private static void outputDateOldMethod() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(date));
    }

    private static void outputDateNewMethod() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
