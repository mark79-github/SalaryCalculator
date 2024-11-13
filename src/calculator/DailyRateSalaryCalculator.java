package calculator;

public class DailyRateSalaryCalculator implements SalaryCalculator {
    private final double dailyRate;
    private final int workingDays;

    public DailyRateSalaryCalculator(double dailyRate, int workingDays) {
        this.dailyRate = dailyRate;
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return dailyRate * workingDays;
    }
}
