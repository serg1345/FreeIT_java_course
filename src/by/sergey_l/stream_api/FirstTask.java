package by.sergey_l.stream_api;

/*
Создать свой функциональный интерфейс для вывода на консоль данных объекта.
С помощью лямбда-выражения вывести данные для объектов типа String и Integer.
 */
@FunctionalInterface
interface Writer {
    void write(Object obj);
}

public class FirstTask {
    public static void main(String[] args) {
        Integer integerValue = 5;
        String stringValue = "test";
        Writer writer = x -> System.out.println(x.toString());
        writer.write(integerValue);
        writer.write(stringValue);
    }
}

