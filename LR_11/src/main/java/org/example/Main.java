package org.example;

public class Main {
    public static void main(String[] args) {
        Professional p = new Professional("Иван", 5, 50000);
        Doctor d = new Doctor("Анна", 10, 80000, "Хирург");
        Engineer e = new Engineer("Пётр", 7, 70000, "Строительство");

        p.work();
        p.work(8);
        p.work("Разработка");
        d.work("Сидоров", 3);
        d.work(5, true);
        e.work("Мост", 1000000);
        e.work(20, "AutoCAD");

        Professional[] pros = {p, d, e};
        for (Professional prof : pros) {
            System.out.println(prof.name + ": " + prof.getResponsibility());
        }

        Professional ref = d;
        ref.work();
        ref.work(6);
        ref.work("Кардиология");
        System.out.println("getResponsibility(): " + ref.getResponsibility());
        System.out.println(ref);
    }
}