package org.example.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }
}
