package HW1;

import java.util.Scanner;
class HourlyRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of working hours per week:");
        float hoursPerWeek;
        hoursPerWeek = scanner.nextFloat();
        System.out.println("Enter annual salary with taxes:");
        float annualSalary;
        annualSalary = scanner.nextFloat();
        System.out.println("Enter the tax percentage:");
        float taxPercentage;
        taxPercentage = scanner.nextFloat();

        float totalHoursPerYear = hoursPerWeek * 52;
        float salaryBeforeTax = annualSalary / (1 + taxPercentage / 100);

        float costPerHour = salaryBeforeTax / totalHoursPerYear;

        System.out.println("With " + hoursPerWeek + " working hours per week and an annual salary of $" +
                annualSalary + " with a tax rate of " + taxPercentage + "%" + "\nthe cost per hour is $" + costPerHour);
    }
}
