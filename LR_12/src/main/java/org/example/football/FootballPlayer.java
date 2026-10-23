package org.example.football;

import java.util.List;

public class FootballPlayer {
    private int id;
    private String name;
    private String position;
    private int rating;
    private List<Integer> matchRatings;

    public FootballPlayer(int id, String name, String position, int rating, List<Integer> matchRatings) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.matchRatings = matchRatings;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public List<Integer> getMatchRatings() { return matchRatings; }

    public double getAverageMatchRating() {
        if (matchRatings == null || matchRatings.isEmpty()) return 0;
        double sum = 0;
        for (int r : matchRatings) sum += r;
        return sum / matchRatings.size();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", имя: " + name + ", позиция: " + position
                + ", рейтинг: " + rating + ", средний рейтинг: " + getAverageMatchRating();
    }
}