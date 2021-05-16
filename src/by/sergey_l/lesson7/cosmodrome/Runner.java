package by.sergey_l.lesson7.cosmodrome;

import by.sergey_l.lesson7.cosmodrome.rocket.Shuttle;
import by.sergey_l.lesson7.cosmodrome.rocket.SpaceX;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome baikonur = new Cosmodrome();
        baikonur.launch(new Shuttle());
        System.out.println("****************************************");
        baikonur.launch(new SpaceX());
    }
}
