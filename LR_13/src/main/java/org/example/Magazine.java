package org.example;
import java.util.HashSet;
import java.util.Set;

public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int pages;
    private double price;
    private final Set<String> subscribers = new HashSet<>();

    public Magazine(String title, String publisher, int issueNumber, int pages, double price) throws InvalidMagazineDataException {
        if (issueNumber <= 0) throw new InvalidMagazineDataException("Номер выпуска должен быть больше нуля, получено: " + issueNumber);
        if (pages <= 0) throw new InvalidMagazineDataException("Количество страниц должно быть больше нуля, получено: " + pages);
        if (title == null || title.isBlank()) throw new InvalidMagazineDataException("Название журнала не может быть пустым");
        if (publisher == null || publisher.isBlank()) throw new InvalidMagazineDataException("Издатель не может быть пустым");
        if (price < 0) throw new InvalidMagazineDataException("Цена не может быть отрицательной");
        this.title = title;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.pages = pages;
        this.price = price;
    }

    public void subscribe(String subscriber) throws SubscriptionException {
        if (subscriber == null || subscriber.isBlank()) throw new SubscriptionException("Имя подписчика не может быть пустым");
        if (subscribers.contains(subscriber)) throw new SubscriptionException("Подписчик " + subscriber + " уже подписан на журнал " + title);
        subscribers.add(subscriber);
    }

    public void unsubscribe(String subscriber) throws SubscriptionException {
        if (subscriber == null || subscriber.isBlank()) throw new SubscriptionException("Имя подписчика не может быть пустым");
        if (!subscribers.remove(subscriber)) throw new SubscriptionException("Подписчик " + subscriber + " не найден среди подписчиков журнала " + title);
    }

    public boolean isSubscribed(String subscriber) { return subscribers.contains(subscriber); }
    public Set<String> getSubscribers() { return new HashSet<>(subscribers); }
    public String getTitle() { return title; }
    public String getPublisher() { return publisher; }
    public int getIssueNumber() { return issueNumber; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Журнал " + title + " (издатель: " + publisher + ", выпуск: " + issueNumber + ", страниц: " + pages + ", цена: " + price + ", подписчиков: " + subscribers.size() + ")";
    }
}