package org.example;

import java.io.*;
import java.util.*;

public class Main {
    static void main() throws IOException {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() throws IOException {
        File file = new File("color.txt");
        try (BufferedWriter w = new BufferedWriter(new FileWriter(file))) {
            w.write("Мой любимый цвет: синий");
            w.newLine();
            w.write("Оттенок: глубокий лазурный");
            w.newLine();
            w.write("Почему нравится: спокойный, ассоциируется с морем и небом");
        }

        System.out.println("Файл: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Содержимое:");
        try (BufferedReader r = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = r.readLine()) != null) System.out.println(line);
        }
    }

    static void task2() throws IOException {
        File f = new File("f2.txt");
        Scanner sc = new Scanner(System.in);
        try (PrintWriter w = new PrintWriter(new FileWriter(f))) {
            for (int i = 1; i <= 10; i++) {
                int n = sc.nextInt();
                w.println(n);
            }
        }

        int count = 0;
        try (Scanner r = new Scanner(f)) {
            while (r.hasNextInt()) {
                int n = r.nextInt();
                System.out.print(n + " ");
                if (n % 2 != 0 && n % 5 == 0) count++;
            }
        }
        System.out.println();
        System.out.println("Нечётных и кратных 5: " + count);
    }

    static void task3() throws IOException {
        File f = new File("f3.txt");
        File g = new File("g3.txt");
        File h = new File("h3.txt");
        Random rnd = new Random();

        try (PrintWriter w = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 20; i++) w.println(rnd.nextInt(100));
        }

        try (Scanner r = new Scanner(f);
             PrintWriter wg = new PrintWriter(new FileWriter(g));
             PrintWriter wh = new PrintWriter(new FileWriter(h))) {
            while (r.hasNextInt()) {
                int n = r.nextInt();
                if (n % 2 == 0 && n < 50) wg.println(n);
                else wh.println(n);
            }
        }

        System.out.print("f: ");
        printFile(f);
        System.out.print("g: ");
        printFile(g);
        System.out.print("h: ");
        printFile(h);
    }

    static void task4() throws IOException {
        File f = new File("salinity.txt");
        Scanner sc = new Scanner(System.in);
        try (PrintWriter w = new PrintWriter(new FileWriter(f))) {
            for (int i = 1; i <= 15; i++) {
                double v = sc.nextDouble();
                w.println(v);
            }
        }

        double sum = 0;
        int count = 0;
        try (Scanner r = new Scanner(f)) {
            while (r.hasNextDouble()) {
                sum += r.nextDouble();
                count++;
            }
        }
        System.out.println("Средняя солёность: " + (sum / count));
    }

    static void task5() throws IOException {
        File f = new File("f5.txt");
        Random rnd = new Random();
        try (PrintWriter w = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 10; i++) w.println(rnd.nextInt(100));
        }

        System.out.print("f: ");
        printFile(f);

        int count = 0;
        try (Scanner r = new Scanner(f)) {
            while (r.hasNextInt()) if (r.nextInt() % 6 == 0) count++;
        }
        System.out.println("Кратных 6: " + count);
    }

    static void printFile(File file) throws IOException {
        try (Scanner r = new Scanner(file)) {
            while (r.hasNextLine()) System.out.print(r.nextLine() + " ");
        }
        System.out.println();
    }
}