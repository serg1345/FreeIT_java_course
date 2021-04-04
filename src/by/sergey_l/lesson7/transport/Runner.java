package by.sergey_l.lesson7.transport;

public class Runner {
    public static void main(String[] args) {
        PassengerCar myCar = new PassengerCar();
        myCar.setBodyType("Хэтчбек");
        myCar.setPassengerCapacity(5);
        myCar.setNumberOfWheels(4);
        myCar.setFuelConsumption(5.7);
        myCar.setBrand("Тойота");
        myCar.setHorsepower(75);
        myCar.setMaxSpeed(200);
        myCar.setWeight(1690);
        System.out.println(myCar.getDescription());
        myCar.printEstimation();
        System.out.println("***************************************");
        Truck myTruck = new Truck(600, 150, 5400, "Volvo", 6,
                25, 20);
        System.out.println(myTruck.getDescription());
        myTruck.testLiftingCapacity();
        System.out.println("****************************************");
        Civil myAirplane = new Civil(2000, 1200, 25000, "Boing", 50,
                1500, 150, true);
        System.out.println(myAirplane.getDescription());
        myAirplane.testPassengerCapacity();
        System.out.println("*****************************************");
        Miltary myWarplane = new Miltary(1500, 2000, 12000, "McDonnell Douglas",
                35, 500, true, 30);
        System.out.println(myWarplane.getDescription());
        myWarplane.shot();
        myWarplane.ejection();

    }
}
