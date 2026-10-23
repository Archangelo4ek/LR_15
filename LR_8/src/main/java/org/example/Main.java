package org.example;

public class Main {
    static void main() {
        Plant[] plants = new Plant[5];

        plants[0] = new Tree("Дуб", 12.0, "Лиственное", 8.5);
        plants[1] = new Tree("Ель", 15.5, "Хвойное", 4.0);
        plants[2] = new Tree("Береза", 9.0, "Лиственное", 5.5);
        plants[3] = new Flower("Роза", 0.8, "Кустарник", "Красный");
        plants[4] = new Flower("Тюльпан", 0.4, "Луковичное", "Желтый");

        System.out.println("Информация о растениях:");
        for (Plant p : plants) {
            p.displayInfo();
            p.grow();
            p.displayInfo();
            IO.println();
        }

        System.out.println("Уникальные методы:");
        for (Plant p : plants) {
            if (p instanceof Tree) {
                ((Tree) p).cutDown();
            } else if (p instanceof Flower) {
                ((Flower) p).bloom();
            }
        }
    }
}