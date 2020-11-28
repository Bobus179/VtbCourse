package org.nazarov.lesson2.obstacles;

import org.nazarov.lesson2.interfaces.Obstacle;
import org.nazarov.lesson2.interfaces.Sportsmen;

public class Wall  implements Obstacle {
    Sportsmen sportsmen;
    static private int count;
    private int height;

    public Wall(int height) {
        if (height<=0){
            System.out.println("Стены нет");
            this.height = 0;
            count++;
        }
        this.height = height;
        count++;
    }

    @Override
    public void overcome(Sportsmen sportsmen) {

        if (height>sportsmen.canJump()){
            this.sportsmen = sportsmen;
            System.out.println(sportsmen.toString() + " не смог перелезть стену № " + count);
            sportsmen.lose();
        }else System.out.println(sportsmen.toString() + " перелез стену № " + count);
    }

}
