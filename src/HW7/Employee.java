package HW7;

public class Employee {
    private String lastName;
    private String firstName;
    private String position;
    private double hourlyRate;

    public Employee(String lastName, String firstName, String position, double hourlyRate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.hourlyRate = hourlyRate;
    }
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setter methods
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // тут розраховуємо тижневу зп
    public double calculateWeeklySalary(double hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}
