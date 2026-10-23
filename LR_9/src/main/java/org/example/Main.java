package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Software[] softwareList = new Software[5];

        softwareList[0] = new Game("Cyberpunk 2077", "2.0", 2999.0, "RPG");
        softwareList[1] = new Game("FIFA 24", "1.0", 3499.0, "Sports");
        softwareList[2] = new Game("Minecraft", "1.20", 1999.0, "Sandbox");

        softwareList[3] = new Editor("Photoshop", "2024", 1500.0, "PSD");
        softwareList[4] = new Editor("Visual Studio Code", "1.85", 0.0, "TXT");

        for (Software sw : softwareList) {
            sw.displayInfo();
            System.out.println("install(): " + sw.install());
            System.out.println("getRequirements(): " + sw.getRequirements());
            System.out.println("getBasicInfo(): " + sw.getBasicInfo());
        }

        System.out.println("Абстрактный класс Software нельзя инстанцировать");
    }
}
