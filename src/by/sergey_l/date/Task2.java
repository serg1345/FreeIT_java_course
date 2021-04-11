package by.sergey_l.date;


/*
По введенной дате вывести возраст
решается двумя способами, используя библиотеку java.util и java.time
 */

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {
    private static int day;
    private static int month;
    private static int year;

    public static void main(String[] args) {
        System.out.println("Введите дату рождения: ");
        inputDate();
        System.out.println("*****************************");
        System.out.println("Ваш возраст: " + getAgeOldMethod());
        System.out.println("*****************************");
        System.out.println("Ваш возраст: " + getAgeNewMethod());
    }

    private static int getAgeOldMethod() {
        int age;
        Calendar now = new GregorianCalendar();
        Date date = new Date(year, month - 1, day);
        age = now.get(Calendar.YEAR) - date.getYear();
        if (now.get(Calendar.MONTH) < date.getMonth()) {
            age--;
        } else if (now.get(Calendar.MONTH) == date.getMonth()) {
            if (now.get(Calendar.DAY_OF_MONTH) < date.getDate()) {
                age--;
            }
        }
        return age;
    }

    private static int getAgeNewMethod() {
        int age;
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(year, month, day);
        age = now.getYear() - date.getYear();
        if (now.getDayOfYear() < date.getDayOfYear()) {
            age--;
        }
        return age;
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
}
