package org.example;

public class GameTree {

    private static GameStage[] tree = new GameStage[10];

    public static void StageInit() {
        tree[0] = new GameStage();
        tree[0].autofilling();
        tree[0].getField().SetSymbol(1,1,'X');


    }

    public static GameStage[] getTree() {
        return tree;
    }

}
