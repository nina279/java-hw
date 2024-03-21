package HW7;

import java.util.UUID;

public class Product {
    private String name;
    private final String id; /*idea пропонує встановити змінну як final,
                              щоб її неможна було змінити з інших класів. Так і зроблю*/
    private double price;
    private String description;
    private boolean availability;

    // 1. конструктор без параметрів для генерації id
    public Product() {
        this.id = UUID.randomUUID().toString();
    }

    // 2. конструктор з усіма полями
    public Product(String name, double price, String description, boolean availability) {
        this(); // для генерації id
        this.name = name;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    // Меоди гет та сет
    public String getName() {
        return name;
    }

    public void setName(String name) { // метод для встановлення назви обʼєкту
        this.name = name;
    }

    public String getId() {
        return id;
    }

    // сетер для id можна було б якби не придумала автоматичне генерування

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { // метод для встановлення ціни обʼєкту
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { // метод для встановлення опису обʼєкту
        this.description = description;
    }

    public boolean isAvailability() {              /* тут ми is використовуємо, тому що я призначила
                                                    булеве значення для цього поля. Тобто ми просто перевіряємо наявність*/
        return availability;
    }

    public void setAvailability(boolean availability) {
    }
}
