package Lesson6.cosmodrome;

public class Cosmodrome {
    public void start(IStart iStart){
        if(!iStart.testSystem()){
            System.out.println("Предстартовая проверка провалена");
        }else{
            iStart.startEngine();
            int i = 10;
            while (i>=0){
                System.out.print(i+" ");
                i--;
            }
            iStart.start();
        }
    }
}
