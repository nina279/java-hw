package HW1;

class HWwithoutMethods {
    public static void main(String[] args) {
        float hoursPerWeek = 40;
        float hourlyRate = 30;
        float taxRate = 20;

        float monthlySalaryNoTax = hoursPerWeek * hourlyRate * 4;
        float monthlySalaryWithTax = monthlySalaryNoTax * (1 - taxRate / 100);
        float yearlySalaryNoTax = monthlySalaryNoTax * 12;
        float yearlySalaryWithTax = monthlySalaryWithTax * 12;

        System.out.println("Salary per month without taxes: " + monthlySalaryNoTax);
        System.out.println("Salary per month with taxes: " + monthlySalaryWithTax);
        System.out.println("Salary per year without taxes: " + yearlySalaryNoTax);
        System.out.println("Salary per year with taxes: " + yearlySalaryWithTax);
    }
}