package day11;

import java.util.Random;

public abstract class Shape {
 
    private int width;
    private int height;

    public Shape(){
        this.width = 0;
        this.height = 0;
    }

    public int getWidth(){
        Random r = new Random();
        // 1~9 + 1 -> 2~10
        int n = r.nextInt(10) + 1;
        return n;
    }

    public int getHeight(){
        Random r = new Random();
        // 1~9 + 1 -> 2~10
        int n = r.nextInt(10) + 1;
        return n;
    }

    public abstract void printArea();

}
