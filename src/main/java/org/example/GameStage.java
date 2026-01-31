package org.example;

public class GameStage {

    private static Table field;

    public static void WriteStage(Table table) {
        field = table;
    }

    public static void autofilling() {
        for (int i = 0; i < Table.GetSize(); i++) {
            for (int j = 0; j < Table.GetSize(); j++) {
                field.getTable()[i][j] = ' ';
            }
        }
    }

    public GameStage() {}

    public static Table getField() {
        return field;
    }
    // method of comparing stages
    // method of turning table
}
