package by.sergey_l.lesson7.transport;

public abstract class Land extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public Land() {
    }

    public Land(int horsepower, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(horsepower, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription();
        str += "; колес: " + numberOfWheels;
        str += "; расход топлива: " + fuelConsumption + "л/100км";
        return str;
    }
}
