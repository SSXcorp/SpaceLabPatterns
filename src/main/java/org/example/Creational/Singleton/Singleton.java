package org.example.Creational.Singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Same object reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Since it's a singleton, comparing references is sufficient
        return this == obj;
    }
}
