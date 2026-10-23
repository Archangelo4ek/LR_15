package org.example;

public class Main {
    static void main() {
        MagazineSubscriptionSystem system = new MagazineSubscriptionSystem();

        try {
            Magazine m1 = new Magazine("National Geographic", "NatGeo", 5, 120, 9.99);
            Magazine m2 = new Magazine("Forbes", "Forbes Media", 3, 80, 7.50);
            system.addMagazine(m1);
            system.addMagazine(m2);

            system.subscribe("National Geographic", 5, "alice@mail.com");
            system.subscribe("National Geographic", 5, "bob@mail.com");
            system.subscribe("Forbes", 3, "alice@mail.com");

            System.out.println("Журнал 1: " + m1);
            System.out.println("Журнал 2: " + m2);

            try {
                system.subscribe("National Geographic", 5, "alice@mail.com");
            } catch (SubscriptionException e) {
                System.out.println("Ошибка подписки: " + e.getMessage());
            }

            system.unsubscribe("National Geographic", 5, "bob@mail.com");
            System.out.println("После отписки bob: " + m1);

            try {
                system.unsubscribe("National Geographic", 5, "charlie@mail.com");
            } catch (SubscriptionException e) {
                System.out.println("Ошибка отписки: " + e.getMessage());
            }

            try {
                system.subscribe("Unknown", 1, "dave@mail.com");
            } catch (MagazineNotFoundException e) {
                System.out.println("Ошибка поиска: " + e.getMessage());
            }
        } catch (InvalidMagazineDataException e) {
            System.out.println("Неверные данные журнала: " + e.getMessage());
        } catch (MagazineNotFoundException | SubscriptionException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new Magazine("Bad", "Publisher", 0, 10, 5.0);
        } catch (InvalidMagazineDataException e) {
            System.out.println("Проверка номера выпуска: " + e.getMessage());
        }

        try {
            new Magazine("Bad", "Publisher", 1, -5, 5.0);
        } catch (InvalidMagazineDataException e) {
            System.out.println("Проверка страниц: " + e.getMessage());
        }
    }
}