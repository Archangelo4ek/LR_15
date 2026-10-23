package org.example;
import org.example.football.FootballPlayer;
import org.example.planets.Dwarf;
import org.example.planets.GasGiant;
import org.example.planets.Planet;
import org.example.planets.Terrestrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Планеты");
        Map<String, Planet> planets = new LinkedHashMap<>();
        planets.put("Земля", new Terrestrial("Земля", 1, 5.97, true));
        planets.put("Марс", new Terrestrial("Марс", 2, 0.64, false));
        planets.put("Венера", new Terrestrial("Венера", 3, 4.87, true));
        planets.put("Юпитер", new GasGiant("Юпитер", 4, 1898.0, true));
        planets.put("Сатурн", new GasGiant("Сатурн", 5, 568.0, true));
        planets.put("Нептун", new GasGiant("Нептун", 6, 102.0, false));
        planets.put("Плутон", new Dwarf("Плутон", 7, 0.013, 5));
        planets.put("Церера", new Dwarf("Церера", 8, 0.0009, 0));

        for (Map.Entry<String, Planet> e : planets.entrySet()) {
            System.out.println("Ключ: " + e.getKey() + ", значение: " + e.getValue());
        }

        System.out.println();
        System.out.println("Футболисты");
        List<FootballPlayer> players = new ArrayList<>();
        players.add(new FootballPlayer(1, "Алиса", "нападающий", 4, Arrays.asList(4, 5, 3, 4)));
        players.add(new FootballPlayer(2, "Борис", "полузащитник", 3, Arrays.asList(2, 3, 4, 3)));
        players.add(new FootballPlayer(3, "Чарли", "защитник", 5, Arrays.asList(5, 5, 4, 5)));
        players.add(new FootballPlayer(4, "Давид", "вратарь", 2, Arrays.asList(1, 2, 2, 3)));
        players.add(new FootballPlayer(5, "Ева", "нападающий", 4, Arrays.asList(4, 4, 4, 5)));
        players.add(new FootballPlayer(6, "Фёдор", "полузащитник", 3, Arrays.asList(3, 3, 3, 3)));

        System.out.println("Футболисты со средним рейтингом больше 3:");
        for (FootballPlayer p : players) {
            if (p.getAverageMatchRating() > 3) {
                System.out.println(p);
            }
        }

        System.out.println();
        System.out.println("Повышение рейтинга у футболистов со средним рейтингом не меньше 4:");
        for (FootballPlayer p : players) {
            if (p.getAverageMatchRating() >= 4) {
                p.setRating(Math.min(5, p.getRating() + 1));
                System.out.println("Повышен: " + p.getName() + ", новый рейтинг: " + p.getRating());
            }
        }

        System.out.println();
        System.out.println("Футболисты с рейтингом не меньше 4:");
        printPlayers(players, 4);

        System.out.println();
        System.out.println("Сортировка по убыванию среднего рейтинга, при равенстве — по имени:");
        List<FootballPlayer> sorted = new ArrayList<>(players);
        sorted.sort((a, b) -> {
            int cmp = Double.compare(b.getAverageMatchRating(), a.getAverageMatchRating());
            if (cmp != 0) return cmp;
            return a.getName().compareTo(b.getName());
        });
        for (FootballPlayer p : sorted) {
            System.out.println("ID: " + p.getId() + ", имя: " + p.getName()
                    + ", средний рейтинг: " + p.getAverageMatchRating());
        }
    }

    public static void printPlayers(List<FootballPlayer> players, int rating) {
        for (FootballPlayer p : players) {
            if (p.getRating() >= rating) {
                System.out.println(p);
            }
        }
    }
}