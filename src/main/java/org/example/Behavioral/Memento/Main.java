package org.example.Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Hello world");
        editor.printText();
        editor.write("Hello SpaceLab");
        editor.printText();
        editor.write("Hello all!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }
}
