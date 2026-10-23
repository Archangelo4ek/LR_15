package org.example;

public class Game extends Software {
    private String genre;

    public Game(String name, String version, double price, String genre) {
        super(name, version, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String install() {
        return "Установка игры занимает 50 ГБ";
    }

    @Override
    public String getRequirements() {
        return "Требуется Windows 10, 16 ГБ RAM";
    }

    @Override
    public void displayInfo() {
        System.out.println("ИГРА: " + getName());
        System.out.println("Версия: " + getVersion());
        System.out.println("Цена: " + getPrice() + " руб.");
        System.out.println("Жанр: " + genre);
        System.out.println("Установка: " + install());
        System.out.println("Требования: " + getRequirements());
        System.out.println();
    }
}
