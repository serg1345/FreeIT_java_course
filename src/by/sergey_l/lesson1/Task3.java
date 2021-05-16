package by.sergey_l.lesson1;

/*
Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.
*/
public class Task3 {
    public static void main(String[] args) {
        int seconds = 4500;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        int weeks = days / 7;
        String string = "";
        string = minutes + " минут " + seconds % 60 + " секунд.";
        System.out.println(string);
        string = hours + " часов " + string;
        System.out.println(string);
        string = days + " дней " + string;
        System.out.println(string);
        string = weeks + " недель " + string;
        System.out.println(string);
    }
}