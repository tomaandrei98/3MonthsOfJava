package org.example.Exceptions;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
        exceptions.doSomething();
    }

    void doSomething(){
        try {
            throw new IOException();
        } catch (IOException | IndexOutOfBoundsException exception) {
            System.out.println("more specific");
            exception.printStackTrace();
        } catch (Exception e) {
            System.out.println("caught ya");
            e.printStackTrace();
        }
    }
}
