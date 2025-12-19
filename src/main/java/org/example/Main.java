package org.example;

import java.util.Scanner;
import static org.example.Game.IsEnd;

public class Main {

    public static void main(String[] args) {

        /*char[][] field = Table();
        while(IsEnd(char[][] table)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

        }*/

        char[][] field = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        for(int i = 0; i < 9; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("X move: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            field[x][y] = 'X';
            for(int k = 0; k < 3; k++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(field[k][j] + " ");
                }
                System.out.println();
            }
            System.out.print("O move: ");
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            field[x0][y0] = 'O';

            for(int k = 0; k < 3; k++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(field[k][j] + " ");
                }
                System.out.println();
            }
        }
    }
}