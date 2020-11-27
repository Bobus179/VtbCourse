package org.nazarov.lesson2.obstacles;

public class Wall extends Obstacle {
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

    public int getHeight() {
        return height;
    }

}
