package org.example;

import java.util.Scanner;
import static org.example.Game.isEnded;
import static org.example.Table.DrawTable;

public class Main {

    public static void main(String[] args) {

        Table field = new Table();
        for (int p = 0; p < field.getSize(); p++) {
            for (int q = 0; q < field.getSize(); q++) {
                field.getTable()[p][q] = ' ';
            }
        }
        int moves = 0;
        while (!Game.getIsEnded()) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("X move: ");
            X x = new X();
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            Game.getCrossX(x0);
            Game.getCrossY(y0);
            x.getCoordinates(x0,y0);
            field.WriteX(x);
            field.getTable()[x.getX()][x.getY()] = 'X';
            Game.incrMoves();
            DrawTable();

            if (Game.isEnded()) break;

            System.out.print("O move: ");
            O o = new O();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            Game.getZeroX(x1);
            Game.getZeroY(y1);
            o.getCoordinates(x1,y1);
            field.WriteO(o);
            field.getTable()[o.getX()][o.getY()] = 'O';
            Game.incrMoves();
            DrawTable();

            if (Game.isEnded()) break;
        }
        System.out.println("game ended");
    }
}