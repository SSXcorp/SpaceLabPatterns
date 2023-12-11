package org.example.Creational.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance("Hello world");
        Singleton y = Singleton.getInstance("Hello world");
        Singleton z = Singleton.getInstance("Hello");

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        System.out.println(x.equals(y));
        System.out.println(y.equals(z));



    }
}
