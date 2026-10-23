package org.example;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double a) {
        this.weight = a;
    }

    public Dog(String name, String breed, int age, double weight) {
       this(name, breed, age);
       this.weight=weight;
    }


    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("Гав!");
    }
}
