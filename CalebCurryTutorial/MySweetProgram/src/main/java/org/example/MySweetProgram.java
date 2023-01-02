package org.example;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class MySweetProgram {
    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        //stack implementation -> LIFO
        System.out.println(names.pop());
        System.out.println(names.remove());
        System.out.println(names.removeFirst());
    }
}