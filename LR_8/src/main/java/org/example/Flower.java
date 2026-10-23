package org.example;

public class Flower extends Plant {
    private String bloomColor;

    public Flower(String name, double height, String type, String bloomColor) {
        super(name, height, type);
        this.bloomColor = bloomColor;
    }

    public String getBloomColor() {
        return bloomColor;
    }

    public void setBloomColor(String bloomColor) {
        this.bloomColor = bloomColor;
    }

    @Override
    public void grow() {
        System.out.println("Растет быстро");
        setHeight(getHeight() + 1.5);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  → Цвет цветения: %s%n", bloomColor);
    }

    public void bloom() {
        System.out.println(getName() + " цветет! Цвет: " + bloomColor);
    }
}