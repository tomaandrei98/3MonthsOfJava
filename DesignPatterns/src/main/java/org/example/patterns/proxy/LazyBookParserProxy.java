package org.example.patterns.proxy;

public class LazyBookParserProxy implements IBookParser {
    private BookParser bookParser;
    private String book;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (bookParser == null) {
            bookParser = new BookParser(book);
        }
        return bookParser.getNumberOfPages();
    }
}
