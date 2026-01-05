package org.example;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import static org.example.Game.*;

public class Main {

public static void main(String[] args) {

        Table field = new Table();

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
            whoWon('X');
            Table.DrawTable();
            if (isEnded()) break;
            else if (Game.getMoves() == Table.GetSize() * Table.GetSize()) {
                System.out.println("Noone wins...");
                whoWon(' ');
                break;
            }

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
            Table.DrawTable();
            whoWon('O');

            if (isEnded()) break;
            else if (Game.getMoves() == Table.GetSize() * Table.GetSize()) {
                System.out.println("Noone wins...");
                whoWon(' ');
                break;
            }
        }

        if (Game.getWinner() == 'X') {
            System.out.println("Player 1 wins!");
        } else if (Game.getWinner() ==  'O') {
            System.out.println("Player 2 wins!");
        }
    }
}