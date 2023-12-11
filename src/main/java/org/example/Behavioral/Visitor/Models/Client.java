package org.example.Behavioral.Visitor.Models;

import lombok.Data;
import org.example.Behavioral.Visitor.Visitor;

@Data
public abstract class Client {

    private final String name;
    private final String address;
    private final String number;

    public abstract void accept(Visitor visitor);

}
