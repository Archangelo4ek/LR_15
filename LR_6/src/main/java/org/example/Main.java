package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", "Лабрадор", 3);
        System.out.println("Собака: " + dog.getName() + ", порода: " + dog.getBreed() + ", возраст: " + dog.getAge());
        dog.bark();

        Dog dog1 = new Dog("Аврора", "Овчарка", 3, 5.66);
    }
}