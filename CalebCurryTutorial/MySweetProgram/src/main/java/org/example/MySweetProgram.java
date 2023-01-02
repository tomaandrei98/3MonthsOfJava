package org.example;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class MySweetProgram {
    public static void main(String[] args) throws FileNotFoundException {

        LinkedList<String> names = new LinkedList<>();
        names.add("Caleb");
        names.add("Sue");
        names.add("Sally");

        //queue implementation -> FIFO
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
    }
}