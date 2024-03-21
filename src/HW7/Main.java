package HW7;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(); // створили обʼєкт

        product.setName("Table"); // виклик методу setName() для встановлення назви товару

        String productName = product.getName();
        System.out.println("Product name is " + productName);

        product.setPrice(99.99); // виклик методу setPrice() для встановлення ціни товару

        double productPrice = product.getPrice();
        System.out.println("Product price is " + productPrice);


        product.setDescription("Round dinner table"); // виклик методу setDescription() для встановлення опису товару

        String productDescription = product.getDescription();
        System.out.println("Product description " + productDescription);

        product.setAvailability(true);  // виклик методу setAvailability() для встановлення наявності товару


        boolean isAvailable = product.isAvailability(); // виклик методу isAvailability() для перевірки наявності товару
        if (isAvailable) {
            System.out.println("Product is available");
        } else {
            System.out.println("Product is not available");
        }

        String productId = product.getId();
        System.out.println("Product id " + productId);

        // створюю об'єкт класу Employee та розраховуємо тижневу зп за методом, збереженим в класі Employee
        Employee employee1 = new Employee("Shevchenko", "Anna", "Secretary", 40.0);
        System.out.println("Employee: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Hourly Rate: " + employee1.getHourlyRate());
        System.out.println("Weekly Salary: " + employee1.calculateWeeklySalary(40)); //беремо 40 часовий день

        // створюю трикутник і роблю розрахунки за створеними методами в класі Triangle
        Triangle triangle = new Triangle(5, 5, 8);
        System.out.println("Perimeter is " + triangle.calculatePerimeter());
        System.out.println("Square is " + triangle.calculateSquare());

        Credit credit = new Credit(1234, 1000, 10, "Активний", 12);

        // погашення кредиту
        double payment = credit.calculatePayment();
        System.out.println("Credit repayment amount: " + payment);

        // перевірка чи кредит прострочений
        if (credit.isOverdue()) {
            System.out.println("Credit is overdue");
        } else {
            System.out.println("Credit is not overdue");
        }
    }
}


