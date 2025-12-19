package org.example;

import java.util.Scanner;
import static org.example.Game.IsEnd;
import static org.example.Table.DrawTable;

public class Main {

    public static void main(String[] args) {

        Table field = new Table();
        for (int i = 0; i < 9; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("X move: ");
            X x = new X();
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            x.getCoordinates(x0,y0);
            field.WriteX(x);
            field.getTable()[x.getX()][x.getY()] = 'X';

            DrawTable();

            System.out.print("O move: ");
            O o = new O();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            o.getCoordinates(x1,y1);
            field.WriteO(o);
            field.getTable()[o.getX()][o.getY()] = 'O';

            DrawTable();
        }
    }
}