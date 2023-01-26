package org.example.patterns.momento;

public class MomentoPattern {
    public static void main(String[] args) {
        var editor = new Editor();

        editor.setContent("a");

        editor.setContent("b");

        editor.setContent("c");
        editor.restore();
        System.out.println("Restored version: " + editor.getContent());
        editor.restore();
        editor.restore();
        System.out.println("Restored version: " + editor.getContent());
    }
}