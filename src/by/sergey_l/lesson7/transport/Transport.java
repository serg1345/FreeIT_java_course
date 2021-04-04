package by.sergey_l.lesson7.transport;

public abstract class Transport {
    private int horsepower;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport() {
    }

    public Transport(int horsepower, int maxSpeed, int weight, String brand) {
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int powerInKilowatt() {
        return (int) (horsepower * 0.74);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        String str = "";
        str += "Марка: " + brand;
        str += "; мощность: " + horsepower + " л.с.(" + powerInKilowatt() + " кВт)";
        str += "; масса: " + weight + "кг";
        str += "; макс. скорость: " + maxSpeed + "км/ч";
        return str;
    }
}
