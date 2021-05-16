package by.sergey_l.lesson7.transport;

public abstract class Air extends Transport {
    private double wingspan;
    private int minRunwayLength;

    public Air() {
    }

    public Air(int horsepower, int maxSpeed, int weight, String brand, double wingspan, int minRunwayLength) {
        super(horsepower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription();
        str += "; размах крыльев: " + wingspan + "м";
        str += "; минимальная длина ВПП: " + minRunwayLength + "м";
        return str;
    }
}
