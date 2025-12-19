package org.example;

public class O {
    private static int x0;
    private static int y0;

    public void getCoordinates(int x, int y){
        x0 = x;
        y0 = y;
    }

    public static int getX() {
        return x0;
    }

    public static int getY() {
        return y0;
    }
}
