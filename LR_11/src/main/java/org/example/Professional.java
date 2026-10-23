package org.example;

public class Professional {
    protected String name;
    protected int experience;
    protected double salary;

    public Professional(String name, int experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Работаю");
    }

    public void work(int hours) {
        System.out.println("Работаю " + hours + " часов");
    }

    public void work(String project) {
        System.out.println("Работаю над проектом " + project);
    }

    public String getResponsibility() {
        return "Общая ответственность";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Имя: " + name + " опыт: " + experience + " ставка: " + salary;
    }
}
