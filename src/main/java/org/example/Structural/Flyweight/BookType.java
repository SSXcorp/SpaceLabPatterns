package org.example.Structural.Flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class BookType {

    private final String type;
    private final String distributor;
    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }
}
