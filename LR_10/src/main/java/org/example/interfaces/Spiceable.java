package org.example.interfaces;

import java.util.List;

public interface Spiceable {
    void addSpice(String spice);
    List<String> getSpices();

    default void showSpices() {
        System.out.println("Специи: " + getSpices());
    }
}