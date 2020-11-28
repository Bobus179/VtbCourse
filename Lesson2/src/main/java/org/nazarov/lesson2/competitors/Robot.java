package org.nazarov.lesson2.competitors;


import org.nazarov.lesson2.interfaces.Sportsmen;

public class Robot implements Sportsmen {
    private final int heightLimit;
    private final int lengthLimit;
    private boolean iAmInPlay = true;
    private static int count=1;
    private final int thisCount=count;

    public Robot(int heightLimit,int lengthLimit) {
        this.heightLimit = heightLimit;
        this.lengthLimit = lengthLimit;
        count++;
    }

    @Override
    public int canJump() {
        return heightLimit;
    }

    @Override
    public int canRun() {
        return lengthLimit;
    }

    @Override
    public boolean iPlay() {
        return iAmInPlay;
    }

    @Override
    public void lose() {
        iAmInPlay=false;
    }

    @Override
    public String toString() {
        return "Robot " + thisCount +" ";
    }
}
