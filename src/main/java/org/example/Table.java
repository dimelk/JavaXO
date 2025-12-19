package org.example;

public class Table {
    final static int Size = 3;
    private static char[][] table = new char[Size][Size];

    public static char[][] getTable() {
        return table;
    }

    public void WriteX(X x) {
        table[x.getX()][x.getY()] = 'X';
    }

    public void WriteO(O o) {
        table[O.getX()][O.getY()] = 'O';
    }

    public static void DrawTable() {
        for(int k = 0; k < 3; k++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(table[k][j] + " | ");
            }
            System.out.println();
            System.out.println("----------|");
        }
    }

}
