package by.sergey_l.lesson7;

/*
Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.
 */
public class Interval {
    private int hours;
    private int minutes;
    private int seconds;

    public Interval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Interval(int seconds) {
        this.seconds = seconds;
    }

    public int getIntervalInSeconds() {
        return ((hours * 60) + minutes) * 60 + seconds;
    }

    public boolean compareTo(Interval interval) {
        if (this.getIntervalInSeconds() == interval.getIntervalInSeconds()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = getIntervalInSeconds() + " секунд";
        return str;
    }

    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 20,10);
        Interval interval2 = new Interval(4810);
        Interval interval3 = new Interval(3,20,535);
        System.out.println(interval1.toString());
        System.out.println(interval2.toString());
        System.out.println(interval3.toString());
        System.out.println(interval1.compareTo(interval2));
        System.out.println((interval1.compareTo(interval3)));
    }
}
