package by.sergey_l.lesson7.cosmodrome.rocket;

public class Shuttle implements IStart {
    @Override
    public boolean checkingSystem() {
        if (Math.random() * 10 > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигательи Шатла запущены. Все системы в норме.");
    }

    @Override
    public void launch() {
        System.out.println("Старт Шаттла");
    }
}
