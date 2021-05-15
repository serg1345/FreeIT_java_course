package by.sergey_l.lesson9;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> myServiceClass = Class.forName("by.sergey_l.lesson9.MyService");
        Annotation[] annotations = myServiceClass.getAnnotations();
        if (annotations.length <= 0) {
         return;
        }
        MyService element = new MyService();
        element.setId(35);
        element.setName("First");
        Method method = element.getClass().getDeclaredMethod("thisClassInfo");
        method.setAccessible(true);
        method.invoke(element);
    }
}
