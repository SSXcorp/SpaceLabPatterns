package org.example.Structural.Flyweight.Test;

import java.util.List;
import java.util.Random;

public class Main {
    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10000000;

    public static void main(String[] args) {

        Store store = new Store();
        Book book1 = new Book(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");
        Book book2 = new Book(getRandomName(), getRandomPrice(), "Fantasy", "Ingram", "Extra");

        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook(getNewObject());
            store.storeBook(getNewObject());

        }

//        store.displayBooks();
        System.out.println(BOOKS_TO_INSERT + " Books Inserted");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + BOOKS_TO_INSERT + " + BookTypes Size (30 bytes) * " + BOOK_TYPES + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((BOOKS_TO_INSERT * 20 + BOOK_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((BOOKS_TO_INSERT * 50) / 1024 / 1024) + "MB)");
        // Tip: Try to comment out the @ToString annotation in the BookType class and check that indeed the same two objects are being referenced by all our books!


        Runtime rt = Runtime.getRuntime();
        long total_mem = rt.totalMemory();
        long free_mem = rt.freeMemory();
        long used_mem = ((total_mem - free_mem)/1024)/1024;
        System.out.println("Amount of used memory: " + used_mem + "MB");
    }

    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble(10, 200);
    }

    private static Book getNewObject() {
        return new Book(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");
    }
}
