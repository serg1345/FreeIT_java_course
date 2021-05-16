package by.sergey_l.lesson7.transport;

public class Miltary extends Air {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public Miltary() {
    }

    public Miltary(int horsepower, int maxSpeed, int weight, String brand, double wingspan, int minRunwayLength,
                   boolean ejectionSystem, int numberOfMissiles) {
        super(horsepower, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription();
        str += "; к-во ракет: " + numberOfMissiles;
        str += "; наличие катапультирования: " + ((ejectionSystem) ? "есть." : "нет.");
        return str;
    }

    public void shot() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла");
            numberOfMissiles--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование успешно");
        } else {
            System.out.println("У Вас нет такой ситсемы");
        }
    }
}
