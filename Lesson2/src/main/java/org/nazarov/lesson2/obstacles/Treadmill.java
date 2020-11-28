package org.nazarov.lesson2.obstacles;

import org.nazarov.lesson2.interfaces.Obstacle;
import org.nazarov.lesson2.interfaces.Sportsmen;

public class Treadmill implements  Obstacle {
    Sportsmen sportsmen;
    static private int count;
    private int length;

    public Treadmill(int length) {
        if (length<=0){
            System.out.println("Некорректная длина дорожки. По умолчанию задано 10м");
            this.length=10;
            count++;
        }
        this.length = length;
        count++;
    }

    @Override
    public void overcome(Sportsmen sportsmen) {
        this.sportsmen = sportsmen;
        if (length>sportsmen.canRun()){
            System.out.println(sportsmen.toString() + " не смог преодолеть дорожку № " + count);
            sportsmen.lose();
        }else System.out.println(sportsmen.toString() + " пробежал дорожку № " + count);

    }

}
