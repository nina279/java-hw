package HW1;

public class HW {
    public static void main(String[] args) {
        float hoursPerWeek = 40;
        float hourlyRate = 30;
        float taxRate = 20;

        // Методи обчислення заробітної плати
        float monthlySalaryNoTax = calculateMonthlySalaryNoTax(hoursPerWeek, hourlyRate);
        float monthlySalaryWithTax = calculateMonthlySalaryWithTax(monthlySalaryNoTax, taxRate);
        float yearlySalaryNoTax = calculateYearlySalaryNoTax(monthlySalaryNoTax);
        float yearlySalaryWithTax = calculateYearlySalaryWithTax(monthlySalaryWithTax);

        System.out.println("Salary per month without taxes: " + monthlySalaryNoTax);
        System.out.println("Salary per month with taxes: " + monthlySalaryWithTax);
        System.out.println("Salary per year without taxes: " + yearlySalaryNoTax);
        System.out.println("Salary per year with taxes: " + yearlySalaryWithTax);
    }

    public static float calculateMonthlySalaryNoTax(float hoursPerWeek, float hourlyRate) {
        return hoursPerWeek * hourlyRate * 4;
    }

    public static float calculateMonthlySalaryWithTax(float monthlySalaryNoTax, float taxRate) {
        return monthlySalaryNoTax * (1 - taxRate / 100);
    }

    public static float calculateYearlySalaryNoTax(float monthlySalaryNoTax) {
        return monthlySalaryNoTax * 12;
    }

    public static float calculateYearlySalaryWithTax(float monthlySalaryWithTax) {
        return monthlySalaryWithTax * 12;
    }
}
