package org.example;

import javax.swing.*;
import java.awt.*;

public class Table  {
    private final static int Size = 3;
    private static char[][] table = new char[Size][Size];

    public static int GetSize() {
        return Size;
    }

    public static char[][] getTable() {
        return table;
    }

    public static void SetSymbol(int x, int y, char symbol) {
        table[x][y] = symbol;
    }

    public void WriteX(X x) {
        table[x.getX()][x.getY()] = 'X';
    }

    public void WriteO(O o) {
        table[O.getX()][O.getY()] = 'O';
    }

    public static void DrawTable() {
        for(int k = 0; k < Size; k++) {
            for(int j = 0; j < Size; j++) {
                System.out.print(table[k][j] + " | ");
            }
            System.out.println();
            System.out.println("----------|");
        }

    }
}
