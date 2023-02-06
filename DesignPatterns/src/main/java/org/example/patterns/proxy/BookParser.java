package org.example.patterns.proxy;

public class BookParser implements IBookParser {

    public BookParser(String data) {
        // expensive parsing
    }

    @Override
    public int getNumberOfPages() {
        // cheap method
        return 0;
    }
}
