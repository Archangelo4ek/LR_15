package org.example;

import org.example.interfaces.Edible;
import org.example.interfaces.Spiceable;
import java.util.ArrayList;
import java.util.List;

public abstract class Food implements Edible, Spiceable {
    protected String name;
    protected int calories;
    protected List<String> spices = new ArrayList<>();

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public void serve() {
        System.out.println("Подаю " + name);
    }

    public void serve(int portions) {
        System.out.println("Подаю " + name + ", порций: " + portions);
    }

    public void serve(String garnish) {
        System.out.println("Подаю " + name + " с гарниром: " + garnish);
    }

    public String getDescription() {
        return "Блюдо: " + name + " (" + calories + " ккал)";
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void addSpice(String spice) {
        spices.add(spice);
    }

    @Override
    public List<String> getSpices() {
        return spices;
    }
}