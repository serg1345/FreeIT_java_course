package by.sergey_l.lesson12;

import java.io.*;

/*
Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
 */
public class Task4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car("Bently", 1000000, 250);
        System.out.println(car);
        FileOutputStream outputStream = new FileOutputStream("src\\by\\sergey_l\\lesson12\\savedCar.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(car);
        objectOutputStream.close();
        car.setBrand("Lexus");
        System.out.println("************");
        System.out.println(car);
        FileInputStream inputStream = new FileInputStream("src\\by\\sergey_l\\lesson12\\savedCar.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        car = (Car) objectInputStream.readObject();
        System.out.println("********************");
        System.out.println(car);
    }
}
