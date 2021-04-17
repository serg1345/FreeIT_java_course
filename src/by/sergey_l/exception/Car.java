package by.sergey_l.exception;

public class Car {
    private String brand;
    private int maxSpeed;
    private int price;

    public Car() {
        this.brand = "unknown";
        this.maxSpeed = -1;
        this.price = -1;
    }

    public Car(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void start() {
        if ((int) (Math.random() * 20) % 2 == 0) {
            throw new MyException();
        }
    }

    public class MyException extends RuntimeException {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 200, 40000);
        Car car2 = new Car();
        Car car3 = new Car("Lexus", 250, 60000);
        try {
            car1.start();
            System.out.println("Автомобиль " + car1.getBrand() + " завелся. Едем в путешествие");
        } catch (MyException e) {
            System.err.println("Автомобиль " + car1.getBrand() + " не завелся. Значит достаем велосипед!");
        }
        try {
            car2.start();
            System.out.println("Автомобиль " + car2.getBrand() + " завелся. Едем в путешествие");
        } catch (MyException e) {
            System.err.println("Автомобиль " + car2.getBrand() + " не завелся. Будь проклят тот день, когда я сел за " +
                    "баранку этого пылесоса");
        }
        try {
            car3.start();
            System.out.println("Автомобиль " + car3.getBrand() + " завелся. Едем в путешествие");
        } catch (MyException e) {
            System.err.println("Автомобиль " + car3.getBrand() + " не завелся. Пора на СТО");
        }
    }
}
