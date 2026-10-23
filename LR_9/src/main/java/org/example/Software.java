package org.example;

public abstract class Software {
    private String name;
    private String version;
    private double price;

    public Software(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String install();
    public abstract String getRequirements();

    public String getBasicInfo() {
        return name + " v" + version + " (цена: " + price + " руб.)";
    }

    public void displayInfo() {
        System.out.println("=== ПО: " + name + " ===");
        System.out.println("Версия: " + version);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Установка: " + install());
        System.out.println("Требования: " + getRequirements());
        System.out.println();
    }
}
