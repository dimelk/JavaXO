package org.example;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import static org.example.Game.*;

public class Main {

public static void main(String[] args) {

        Table field = new Table();

    for (int i = 0; i < Table.GetSize(); i++) {
        for (int j = 0; j < Table.GetSize(); j++) {
            field.SetSymbol(i,j,' ');
        }
    }

        int moves = 0;
        while (!getIsEnded()) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Player 1 (X) move: ");
            X x = new X();      // create new cross to put it on table
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            getCrossX(x0);      // write coordinates of it into his private data
            getCrossY(y0);
            x.getCoordinates(x0,y0);
            field.WriteX(x);       // Put cross on game field
            field.getTable()[x.getX()][x.getY()] = 'X';  // Set this symbol on field
            incrMoves();  // plus one move
            whoWon('X');  // last move is for winner (if he wins)
            Table.DrawTable();
            if (isEnded()) break;   // check for ending
            else if (Game.getMoves() == Table.GetSize() * Table.GetSize()) {  // if field is full ends game with no winner
                System.out.println("Noone wins...");
                whoWon(' ');
                break;
            }

            System.out.print("Player 2 (O) move: "); // same actions for symbol of zero
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


        if (Game.getWinner() == 'X') {  // checking if last symbol of winner was cross or zero
            System.out.println("Player 1 wins!");
        } else if (Game.getWinner() ==  'O') {
            System.out.println("Player 2 wins!");
        }
    }
}