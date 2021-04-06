package Lesson6.robot;

import Lesson6.robot.hands.SamsungHand;
import Lesson6.robot.hands.SonyHand;
import Lesson6.robot.hands.ToshibaHand;
import Lesson6.robot.heads.SamsungHead;
import Lesson6.robot.heads.SonyHead;
import Lesson6.robot.heads.ToshibaHead;
import Lesson6.robot.legs.SamsungLeg;
import Lesson6.robot.legs.SonyLeg;
import Lesson6.robot.legs.ToshibaLeg;

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
        SamsungHand samsungHand = new SamsungHand(5);
        SonyHand sonyHand = new SonyHand(4);
        ToshibaHand toshibaHand = new ToshibaHand(3);

        SamsungHead samsungHead = new SamsungHead(10);
        SonyHead sonyHead = new SonyHead(9);
        ToshibaHead toshibaHead = new ToshibaHead(8);

        SamsungLeg samsungLeg = new SamsungLeg(1);
        ToshibaLeg toshibaLeg = new ToshibaLeg(2);
        SonyLeg sonyLeg = new SonyLeg(3);

        Robot roboCop = new Robot(samsungHead, samsungHand, toshibaLeg);
        Robot terminator = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot liquidMetal = new Robot(toshibaHead, sonyHand, sonyLeg);

        roboCop.action();
        terminator.action();
        liquidMetal.action();
        System.out.println(roboCop.getPrice() + "   " + terminator.getPrice() + "   " + liquidMetal.getPrice());
        if (roboCop.getPrice() > terminator.getPrice() && roboCop.getPrice() > liquidMetal.getPrice()) {
            System.out.println("Самый дорогой робот - RoboCop, он стоит: " + roboCop.getPrice());
        } else if (terminator.getPrice() > roboCop.getPrice() && terminator.getPrice() > liquidMetal.getPrice()) {
            System.out.println("Самый дорогой робот - Terminator, он стоит: " + terminator.getPrice());
        } else {
            System.out.println("Самый дорогой робот - LiquidMetal, он стоит: " + liquidMetal.getPrice());
        }
    }
}
