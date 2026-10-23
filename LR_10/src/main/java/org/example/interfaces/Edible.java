package org.example.interfaces;

public interface Edible {
    void eat();
    int getCalories();
    int count = 0;
    static void describe() {
        System.out.println("Объект съедобен");
    }
}