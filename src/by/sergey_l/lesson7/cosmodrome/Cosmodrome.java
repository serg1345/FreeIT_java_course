package by.sergey_l.lesson7.cosmodrome;

import by.sergey_l.lesson7.cosmodrome.rocket.IStart;

import java.util.concurrent.TimeUnit;

public class Cosmodrome {
    public void launch(IStart rocket) throws InterruptedException {
        if (!rocket.checkingSystem()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            rocket.startEngine();
            for (int i = 10; i >= 0; i--) {
                System.out.print(i + "\r");
                TimeUnit.SECONDS.sleep(1);
            }
            rocket.launch();
        }
    }

}
