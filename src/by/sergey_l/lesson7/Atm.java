package by.sergey_l.lesson7;

import java.util.Scanner;

/*
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 */
public class Atm {
    private int qnt20;
    private int qnt50;
    private int qnt100;

    public Atm(int qnt20, int qnt50, int qnt100) {
        this.qnt20 = qnt20;
        this.qnt50 = qnt50;
        this.qnt100 = qnt100;
    }

    public void addCash(int qnt20, int qnt50, int qnt100) {
        this.qnt20 += qnt20;
        this.qnt50 += qnt50;
        this.qnt100 += qnt100;
    }

    public boolean receiveMoney(int sum) {
        int qnt20;
        int qnt50;
        int qnt100;
        if ((sum > this.qnt100 * 100 + this.qnt50 * 50 + this.qnt20 * 20) || (sum % 50 % 20 != 0)) {
            return false;
        } else {
            qnt100 = sum / 100;
            if (qnt100 > this.qnt100) {
                sum = sum - this.qnt100 * 100;
            } else {
                sum = sum - qnt100 * 100;
            }
            qnt50 = sum / 50;
            if (qnt50 > this.qnt50) {
                sum = sum - this.qnt50 * 50;
            } else {
                sum = sum - qnt50 * 50;
            }
            if (sum % 20 != 0) {
                return false;
            } else {
                qnt20 = sum / 20;
                if (qnt20 > this.qnt20) {
                    return false;
                } else {
                    sum = sum - qnt20 * 20;
                }
            }
            System.out.println("Выдано: " + qnt20 + "*20 + " + qnt50 + "*50 + " + qnt100 + "*100 = " +
                    (qnt20 * 20 + qnt50 * 50 + qnt100 * 100));
            addCash(-qnt20, -qnt50, -qnt100);
        }
        return true;
    }

    public static void main(String[] args) {
        Atm atm = new Atm(1,1,1);
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите необходимую сумму >> ");
        while (!done) {
            while (sc.hasNextInt() == false) {
                System.out.print("Некорректная сумма, повторите >> ");
                sc.next();
            }
            sum = sc.nextInt();
            if (sum > 0) {
                done = true;
            } else {
                System.out.print("Некорректная сумма, повторите >> ");
            }
        }
        if (!atm.receiveMoney(sum)) {
            System.out.println("Невозможно выдать запрошенную сумму");
        }
    }
}
