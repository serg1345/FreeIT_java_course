package by.sergey_l.stream_api;

/*
Задать список учеников с принадлежностью к классу (создать класс Student).
Используя средства Stream API 1) вывести список фамилий 2) создать Map со
списком учеников для каждого класса
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FifthTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Иванов", "первый"));
        students.add(new Student("Петров", "третий"));
        students.add(new Student("Сидоров", "второй"));
        students.add(new Student("Козлов", "третий"));
        students.add(new Student("Смирнов", "второй"));
        students.add(new Student("Кузнецов", "первый"));
        students.stream().forEach(student -> System.out.println(student.getName()));
        Map<String, List<Student>> groupByKlazz = students.stream().collect(Collectors.groupingBy(Student::getKlazz));
    }
}

class Student {
    private String name;
    private String klazz;

    public Student(String name, String klazz) {
        this.name = name;
        this.klazz = klazz;
    }

    public String getName() {
        return name;
    }

    public String getKlazz() {
        return klazz;
    }
}