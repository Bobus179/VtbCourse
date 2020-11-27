package org.nazarov.lesson2.obstacles;

public class Treadmill extends Obstacle {
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

    public int getLength() {
        return length;
    }

}
