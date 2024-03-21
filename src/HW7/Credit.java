package HW7;

import java.time.LocalDate;
//
public class Credit {
    private int clientId;
    private double amount;
    private double creditRate;
    private String status;
    private int term;

    // Конструктор з усіма полями
    public Credit(int clientId, double amount, double creditRate, String status, int term) {
        this.clientId = clientId;
        this.amount = amount;
        this.creditRate = creditRate;
        this.status = status;
        this.term = term;
    }

    // метод для розрахунку суми виплат за кредитом
    public double calculatePayment() {
        double totalPayment = amount * (1 + (creditRate / 100)); // тут вираховуємо з відсотками
        return totalPayment;
    }

    // метод для перевірки статусу кредиту
    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = LocalDate.now().plusMonths(term); // якщо термін вказується у місяцях
        return currentDate.isAfter(endDate);
    }
}

