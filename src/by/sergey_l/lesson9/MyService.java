package by.sergey_l.lesson9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

@Version(num = "1.0")
public class MyService {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    private void thisClassInfo() {
        System.out.println("В классе имеются следующие поля: ");
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field element: fields) {
            System.out.println(element);
        }
        System.out.println("В классе имеются следующие методы: ");
        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method element: methods) {
            System.out.println(element);
        }
    }

    public MyService() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
