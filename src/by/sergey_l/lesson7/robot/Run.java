package by.sergey_l.lesson7.robot;

import by.sergey_l.lesson7.robot.hands.SamsungHand;
import by.sergey_l.lesson7.robot.hands.SonyHand;
import by.sergey_l.lesson7.robot.hands.ToshibaHand;
import by.sergey_l.lesson7.robot.heads.SamsungHead;
import by.sergey_l.lesson7.robot.heads.SonyHead;
import by.sergey_l.lesson7.robot.heads.ToshibaHead;
import by.sergey_l.lesson7.robot.legs.SamsungLeg;
import by.sergey_l.lesson7.robot.legs.SonyLeg;
import by.sergey_l.lesson7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SonyHead sonyHead = new SonyHead(200);
        ToshibaHead toshibaHead = new ToshibaHead(250);
        SamsungHead samsungHead = new SamsungHead(300);
        SonyLeg sonyLeg = new SonyLeg(200);
        ToshibaLeg toshibaLeg = new ToshibaLeg(270);
        SamsungLeg samsungLeg = new SamsungLeg(240);
        SonyHand sonyHand = new SonyHand(200);
        ToshibaHand toshibaHand = new ToshibaHand(180);
        SamsungHand samsungHand = new SamsungHand(150);
        Robot robot1 = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot robot2 = new Robot(toshibaHead, samsungHand, sonyLeg);
        Robot robot3 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robot1.action();
        robot2.action();
        robot3.action();
        if ((robot1.getPrice() > robot2.getPrice()) && (robot1.getPrice() > robot3.getPrice())) {
            System.out.println("Самый дорогой робот 1");
        }
        if ((robot2.getPrice() > robot1.getPrice()) && (robot2.getPrice() > robot3.getPrice())) {
            System.out.println("Самый дорогой робот 2");
        }
        if ((robot3.getPrice() > robot2.getPrice()) && (robot3.getPrice() > robot1.getPrice())) {
            System.out.println("Самый дорогой робот 3");
        }
    }
}
