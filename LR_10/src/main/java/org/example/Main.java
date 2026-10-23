package org.example;

import org.example.interfaces.Edible;
import org.example.interfaces.Spiceable;

public class Main {
    public static void main(String[] args) {
        Edible.describe();

        Food[] dishes = {
                new Pasta("Карбонара", 550, "сливочный"),
                new Pasta("Болоньезе", 620, "томатный"),
                new Pasta("Феттучине", 480, "грибной"),
                new Salad("Цезарь", 300, "соус Цезарь"),
                new Salad("Греческий", 200, "масло")
        };

        dishes[0].addSpice("пармезан");
        dishes[1].addSpice("базилик");
        dishes[2].addSpice("чили");
        dishes[3].addSpice("гренки");
        dishes[4].addSpice("орегано");

        System.out.println("\nПерегрузка:");
        dishes[0].serve();
        dishes[0].serve(2);
        dishes[0].serve("хлеб");

        System.out.println("\nПереопределение:");
        for (Food dish : dishes) {
            System.out.println(dish.getDescription());
        }

        System.out.println("\nЕда:");
        int totalCalories = 0;
        for (Food dish : dishes) {
            dish.eat();
            totalCalories += dish.getCalories();
        }
        System.out.println("Итого калорий: " + totalCalories);

        System.out.println("\nСпеции:");
        for (Food dish : dishes) {
            dish.showSpices();
        }
    }
}