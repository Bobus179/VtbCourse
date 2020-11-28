package org.nazarov.lesson2;

import org.nazarov.lesson2.competitors.*;
import org.nazarov.lesson2.interfaces.*;
import org.nazarov.lesson2.obstacles.*;

public class MainApp {
    public static void main(String[] args) {

        Sportsmen[]sportsmen = new Sportsmen[]{
            new Cat(1,200),
            new Human(2,1000),
            new Robot(3,10000),
            new Cat(3,300),
            new Human(2,500),
            new Robot(0,2000),
        };

        Obstacle []obstacles = new Obstacle[]{
            new Treadmill(100),
            new Wall(2),
            new Treadmill(300),
            new Wall(3),
            new Treadmill(1500),
            new Wall(3),
        };

        for (Sportsmen s:sportsmen){
            for (Obstacle o:obstacles){
                if (s.iPlay()){
                    o.overcome(s);
                }
            }
        }

    }

}