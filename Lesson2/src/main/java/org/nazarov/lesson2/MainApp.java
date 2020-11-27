package org.nazarov.lesson2;

import org.nazarov.lesson2.competitors.*;
import org.nazarov.lesson2.interfaces.*;
import org.nazarov.lesson2.obstacles.*;

public class MainApp {
    public static void main(String[] args) {
        // плохо, что не могу объеденить бкгунов под общим классом по условию задачи -> дублируется код и создается
        //  массив по интерфейсу, а не по классу-родителю -> сложно добраться до полей(метод в майне youLeftTheRace)
        Cat cat1 = new Cat(4,200);
        Human human1 = new Human(2,1000);
        Robot robot1 = new Robot(3,10000);
        Cat cat2 = new Cat(3,300);
        Human human2 = new Human(2,500);
        Robot robot2 = new Robot(0,2000);

        Movable []movables = new Movable[]{     //плохо, что ы одном интерфейсе два метода
                cat1,cat2,human1,human2,robot1,robot2
        };


        Treadmill treadmill1= new Treadmill(100);
        Wall wall1 = new Wall(1);
        Treadmill treadmill2= new Treadmill(300);
        Wall wall2 = new Wall(2);
        Treadmill treadmill3= new Treadmill(1500);
        Wall wall3 = new Wall(3);

        Obstacle []obstacles = new Obstacle[]{
                treadmill1,wall1,treadmill2,wall2,treadmill3,wall3
        };

        for (Movable m:movables){
            for (Obstacle o: obstacles){
                if (iAmStillInTheGame(m) && o instanceof Treadmill){
                    m.run(((Treadmill) o).getLength());
                }else
                    if (iAmStillInTheGame(m) && o instanceof Wall){
                        m.jump(((Wall) o).getHeight());
                    }

            }
        }
    }
    public static boolean iAmStillInTheGame(Object o){
        if (o instanceof Cat) {
            return !((Cat) o).isLeftTheRace();
        }else if (o instanceof Human){
            return !((Human) o).isLeftTheRace();
        }else if (o instanceof Robot){
            return !((Robot) o).isLeftTheRace();
        }
        return false;
    }
}