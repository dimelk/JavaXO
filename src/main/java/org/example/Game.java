package org.example;
public class Game {

    private static int sumCrossX = 0;
    private static int sumCrossY = 0;

    private static int sumZeroX = 0;
    private static int sumZeroY = 0;

    private static boolean isEnded = false;

    private static int moves = 0;

    public static final char[] symbols = {'X', '0'};
    public static boolean isEnded() {

        if (moves > 4) {
            if ((sumCrossX % 3 == 0) || (sumCrossY % 3 == 0) || (sumZeroX % 3 == 0) || (sumZeroY % 3 == 0)) {
                isEnded = true;
            }
        }

        if (isEnded) return true;
        else return false;
    }
    public static void getCrossX(int x) {
        sumCrossX += x;
    }

    public static void getCrossY(int y) {
        sumCrossY += y;
    }

    public static void getZeroX(int x) {
        sumZeroX += x;
    }

    public static void getZeroY(int y) {
        sumZeroY += y;
    }

    public static boolean getIsEnded() {
        return isEnded;
    }

    public static void incrMoves() {
        moves++;
    }
}
