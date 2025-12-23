package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Game {

    private static List<Integer> CrossX = new ArrayList<>();
    private static List<Integer> CrossY = new ArrayList();

    private static List<Integer> ZeroX = new ArrayList();
    private static List<Integer> ZeroY = new ArrayList();

    private static char winner = ' ';

    private static boolean isEnded = false;

    private static int moves = 0;

    public static final char[] symbols = {'X', '0'};
    public static boolean isEnded() {

        if (hasEquals(CrossX) || hasEquals(CrossY) || hasEquals(ZeroX) || hasEquals(ZeroY)) isEnded = true;
            if ((CrossX.stream().mapToInt(Integer::intValue).sum() == 3 && CrossY.stream().mapToInt(Integer::intValue).sum() == 3)) isEnded = true;

            if ((ZeroX.stream().mapToInt(Integer::intValue).sum() == 3) && (ZeroY.stream().mapToInt(Integer::intValue).sum() == 3)) isEnded = true;

        return isEnded;
    }

    public static void getCrossX(int x) {
        CrossX.add(x);
    }
    public static void getCrossY(int y) {
        CrossY.add(y);
    }

    public static void getZeroX(int x) {
        ZeroX.add(x);
    }

    public static void getZeroY(int y) {
        ZeroY.add(y);
    }

    public static boolean getIsEnded() {
        return isEnded;
    }

    public static void incrMoves() {
        moves++;
    }

    public static void whoWon(char win) {
        winner = win;
    }

    public static char getWinner() {
        return winner;
    }

    public static int getMoves() {
        return moves;
    }

    public static List<Integer> getSetX() {
        return CrossX;
    }

    public static List<Integer> getSetY() {
        return CrossY;
    }

    public static boolean hasEquals(List<Integer> x) {
        Map<Integer, Integer> freaquency = new HashMap<>();
        for (int i: x) {
            freaquency.put(i, freaquency.getOrDefault(i, 0) + 1);
        }
        for(int value: freaquency.values()) {
            if(value == 3) return true;
        }
        return false;
    }
}
