package org.example.Structural.Flyweight.Test;

import java.util.ArrayList;
import java.util.List;

public class Store {
    final List<Book> books = new ArrayList<>();

    public void storeBook(Book book) {
        books.add(book);
    }
}
