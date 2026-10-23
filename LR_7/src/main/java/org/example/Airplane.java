package org.example;

public class Airplane {
    private String model;
    private int capacity;
    private int range;

    private static int totalPlanes = 0;
    private static int totalCapacity = 0;

    public static void print() {
        System.out.println(totalPlanes);

    }

    public Airplane(String model, int capacity, int range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;
        totalPlanes++;
        totalCapacity += capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        totalCapacity -= this.capacity;
        this.capacity = capacity;
        totalCapacity += capacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public static int getTotalPlanes() {
        return totalPlanes;
    }

    public static int getTotalCapacity() {
        return totalCapacity;
    }

    public static double getAverageCapacity() {
        if (totalPlanes == 0) {
            return 0;
        }
        return (double) totalCapacity / totalPlanes;
    }
}