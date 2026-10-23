package org.example;

import java.util.ArrayList;
import java.util.List;

public class MagazineSubscriptionSystem {
    private final List<Magazine> magazines = new ArrayList<>();

    public void addMagazine(Magazine magazine) { magazines.add(magazine); }

    public Magazine findMagazine(String title, int issueNumber) throws MagazineNotFoundException {
        for (Magazine m : magazines) {
            if (m.getTitle().equalsIgnoreCase(title) && m.getIssueNumber() == issueNumber) return m;
        }
        throw new MagazineNotFoundException("Журнал " + title + " выпуск " + issueNumber + " не найден");
    }

    public void subscribe(String title, int issueNumber, String subscriber) throws MagazineNotFoundException, SubscriptionException {
        findMagazine(title, issueNumber).subscribe(subscriber);
    }

    public void unsubscribe(String title, int issueNumber, String subscriber) throws MagazineNotFoundException, SubscriptionException {
        findMagazine(title, issueNumber).unsubscribe(subscriber);
    }

    public List<Magazine> getMagazines() { return new ArrayList<>(magazines); }
}