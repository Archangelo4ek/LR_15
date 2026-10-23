package org.example;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing 737", 180, 5000);
        Airplane a2 = new Airplane("Airbus A320", 160, 6100);
        Airplane a3 = new Airplane("Boeing 777", 300, 11000);

        System.out.println("Самолет 1: " + a1.getModel() + ", вместимость: " + a1.getCapacity() + ", дальность: " + a1.getRange());
        System.out.println("Самолет 2: " + a2.getModel() + ", вместимость: " + a2.getCapacity() + ", дальность: " + a2.getRange());
        System.out.println("Самолет 3: " + a3.getModel() + ", вместимость: " + a3.getCapacity() + ", дальность: " + a3.getRange());
        a1.setModel("Boeing 737 MAX");
        a1.setCapacity(200);
        a1.setRange(6500);
        System.out.println("После изменения самолет 1: " + a1.getModel() + ", вместимость: " + a1.getCapacity() + ", дальность: " + a1.getRange());
        System.out.println("Всего самолетов: " + Airplane.getTotalPlanes());
        System.out.println("Общая вместимость: " + Airplane.getTotalCapacity());
        System.out.println("Средняя вместимость: " + Airplane.getAverageCapacity());
    }
}