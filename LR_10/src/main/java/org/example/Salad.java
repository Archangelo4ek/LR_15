package org.example;

import org.example.interfaces.Edible;
import org.example.interfaces.Spiceable;

public class Salad extends Food {
    private String dressing;

    public Salad(String name, int calories, String dressing) {
        super(name, calories);
        this.dressing = dressing;
    }

    @Override
    public void eat() {
        System.out.println("Едим салат " + name + ", заправка: " + dressing + ", специи: " + spices);
    }

    @Override
    public String getDescription() {
        return "Салат: " + name + ", заправка: " + dressing + ", " + calories + " ккал";
    }
}