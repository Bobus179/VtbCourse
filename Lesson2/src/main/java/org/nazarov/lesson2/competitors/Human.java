package org.nazarov.lesson2.competitors;

import org.nazarov.lesson2.interfaces.Movable;

public class Human implements Movable {

    private final int heightLimit;
    private final int lengthLimit;
    private boolean leftTheRace;
    private static int count=1;
    private final int thisCount =count;

    public Human(int heightLimit,int lengthLimit) {
        this.heightLimit = heightLimit;
        this.lengthLimit = lengthLimit;
        count++;
    }

    public boolean isLeftTheRace() {
        return leftTheRace;
    }

    public void jump(int height) {
        if (height>this.heightLimit) {
            leftTheRace = true;
            System.out.println("Человек под номером " + thisCount + " покинул гонку.");
        }else System.out.println("Человек под номером " + thisCount + " перепрынул стену.");
    }

    public void run(int length) {
        if (length>this.lengthLimit) {
            leftTheRace = true;
            System.out.println("Человек под номером " + thisCount + " покинул гонку.");
        }else System.out.println("Человек под номером " + thisCount + " пробежал дистанцию.");
    }

}
