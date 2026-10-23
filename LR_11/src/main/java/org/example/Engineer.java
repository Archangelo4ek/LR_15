package org.example;

public class Engineer extends Professional {
    private String field;

    public Engineer(String name, int experience, double salary, String field) {
        super(name, experience, salary);
        this.field = field;
    }

    @Override
    public String getResponsibility() {
        return "Проектирование";
    }

    public void work(String project, double budget) {
        System.out.println("Проектирую " + project + " с бюджетом " + budget);
    }

    public void work(int drawings, String software) {
        System.out.println("Создаю " + drawings + " чертежей в " + software);
    }

    @Override
    public String toString() {
        return super.toString() + " поле: " + field;
    }
}
