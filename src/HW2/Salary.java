package HW2;

public class Salary {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        float hourlyRate = Float.parseFloat(args[1]);
        float taxRate = Float.parseFloat(args[2]);

        int totalDays = getDaysInMonth(month);
        int totalWorkingDays = getTotalWorkingDays(totalDays);

        float salaryWithoutTax = totalWorkingDays * 8 * hourlyRate;
        float taxAmount = salaryWithoutTax * (taxRate / 100);
        float salaryWithTax = salaryWithoutTax - taxAmount;

        System.out.println("Salary for the month without tax: $" + salaryWithoutTax);
        System.out.println("Salary for the month with tax: $" + salaryWithTax);
    }

    private static int getDaysInMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static int getTotalWorkingDays(int totalDays) {
        int workingDays = 0;
        for (int i = 1; i <= totalDays; i++) {
            if (i % 7 != 0 && i % 7 != 6) { // Considering Monday as the first day (0-based index)
                workingDays++;
            }
        }
        return workingDays;
    }
}
