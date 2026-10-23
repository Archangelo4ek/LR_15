package org.example.planets;

public class Planet {
    private String name;
    private int id;
    private double mass;

    public Planet(String name, int id, double mass) {
        this.name = name;
        this.id = id;
        this.mass = mass;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getMass() { return mass; }

    @Override
    public String toString() {
        return "Название: " + name + ", id: " + id + ", масса: " + mass;
    }
}