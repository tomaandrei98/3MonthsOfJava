package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MySweetProgram {
    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        ListIterator<String> it = names.listIterator();
        it.add("Susan");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (String name : names) {
            System.out.println(name);
        }

        //stack implementation -> LIFO
        System.out.println(names.pop());
        System.out.println(names.remove());
        System.out.println(names.removeFirst());
    }
}