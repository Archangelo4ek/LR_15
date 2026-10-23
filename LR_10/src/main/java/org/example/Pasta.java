package org.example;

import org.example.interfaces.Edible;
import org.example.interfaces.Spiceable;

public class Pasta extends Food {
    private String sauce;

    public Pasta(String name, int calories, String sauce) {
        super(name, calories);
        this.sauce = sauce;
    }

    @Override
    public void eat() {
        System.out.println("Едим пасту " + name + ", соус: " + sauce + ", специи: " + spices);
    }

    @Override
    public String getDescription() {
        return "Паста: " + name + ", соус: " + sauce + ", " + calories + " ккал";
    }

    public void eat(String forkType) {
        System.out.println("Едим пасту " + name + " с помощью " + forkType);
    }
}