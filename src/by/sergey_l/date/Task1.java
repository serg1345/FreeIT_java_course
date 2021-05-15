package by.sergey_l.date;

/*
По введенной дате вывести название месяца.
решается двумя способами, используя библиотеку java.util и java.time
 */


import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    private static int day;
    private static int month;
    private static int year;

    public static void main(String[] args) {
        inputDate();
        System.out.println("*****************************");
        System.out.println(getMonthOldStyle()); // используем java.util
        System.out.println("*****************************");
        System.out.println(getMounthNewStyle()); // используем java.time
    }

    private static void inputDate() {
        /*
        Метод последовательно считывает с клавиатуры год, месяц и число, проверяет введенные пользователем данные
        учитывая количество дней в месяце с учетом виоскосный год или нет и записывает полученные данные в поля класса.
         */
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("Введите год: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Неккоректный ввод, повторите: ");
                scanner.next();
            }
            year = scanner.nextInt();
            if (year > 0) {
                done = true;
            } else {
                System.out.println("Неккоректный ввод, повторите: ");
            }
        }
        boolean intercalaryYear;
        if (year % 4 != 0) {
            intercalaryYear = false;
        } else if (year % 100 != 0) {
            intercalaryYear = true;
        } else if (year % 400 == 0) {
            intercalaryYear = true;
        } else {
            intercalaryYear = false;
        }
        done = false;
        while (!done) {
            System.out.print("Введите месяц: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Неккоректный ввод, повторите: ");
                scanner.next();
            }
            month = scanner.nextInt();
            if ((month > 0) && (month <= 12)) {
                done = true;
            } else {
                System.out.println("Неккоректный ввод, повторите: ");
            }
        }
        boolean monthLong;
        if ((month == 2) || (month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            monthLong = false;
        } else {
            monthLong = true;
        }
        done = false;
        while (!done) {
            System.out.print("Введите число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Неккоректный ввод, повторите: ");
                scanner.next();
            }
            day = scanner.nextInt();
            if (day > 0) {
                if ((monthLong) && (day <= 31)) {
                    done = true;
                } else if ((!monthLong) && (month != 2) && (day <= 30)) {
                    done = true;
                } else if ((month == 2) && (intercalaryYear) && (day <= 29)) {
                    done = true;
                } else if ((month == 2) && (!intercalaryYear) && (day <= 28)) {
                    done = true;
                } else {
                    System.out.println("Неккоректный ввод, повторите: ");
                }
            } else {
                System.out.println("Неккоректный ввод, повторите: ");
            }
        }
    }

    private static String getMonthOldStyle() {
        Date date = new Date(year, month - 1, day);
        System.out.println(date);
        int month = date.getMonth();
        String monthString;
        switch (month) {
            case 0:
                monthString = "январь";
                break;
            case 1:
                monthString = "февраль";
                break;
            case 2:
                monthString = "март";
                break;
            case 3:
                monthString = "апрель";
                break;
            case 4:
                monthString = "май";
                break;
            case 5:
                monthString = "июнь";
                break;
            case 6:
                monthString = "июль";
                break;
            case 7:
                monthString = "август";
                break;
            case 8:
                monthString = "сентябрь";
                break;
            case 9:
                monthString = "октябрь";
                break;
            case 10:
                monthString = "ноябрь";
                break;
            case 11:
                monthString = "декабрь";
                break;
            default:
                monthString = "";
        }
        return monthString;
    }

    private static String getMounthNewStyle() {
        String monthString = "";
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date);
        monthString = date.getMonth().toString();
        return monthString;
    }
}
