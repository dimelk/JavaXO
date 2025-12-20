package org.example;

import java.util.*;
import java.util.HashMap;
import java.util.Map;


import static org.example.Game.*;
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
        while (!getIsEnded()) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Player 1 (X) move: ");
            X x = new X();
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            getCrossX(x0);
            getCrossY(y0);
            x.getCoordinates(x0,y0);
            field.WriteX(x);
            field.getTable()[x.getX()][x.getY()] = 'X';
            incrMoves();
            DrawTable();
            if (Game.getMoves() == field.getSize() * field.getSize()) {
                System.out.println("Noone wins...");
                whoWon(' ');
                break;
            }
            whoWon('X');

            if (isEnded()) break;

            System.out.print("Player 2 (O) move: ");
            O o = new O();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            getZeroX(x1);
            getZeroY(y1);
            o.getCoordinates(x1,y1);
            field.WriteO(o);
            field.getTable()[o.getX()][o.getY()] = 'O';
            incrMoves();
            DrawTable();
            if (Game.getMoves() == field.getSize() * field.getSize()) {
                System.out.println("Noone wins...");
                whoWon(' ');
                break;
            }
            whoWon('O');

            if (isEnded()) break;
        }

        if (Game.getWinner() == 'X') {
            System.out.println("Player 1 wins!");
        } else if (Game.getWinner() ==  'O') {
            System.out.println("Player 2 wins!");
        }

    }
}