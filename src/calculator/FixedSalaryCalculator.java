package calculator;

public class FixedSalaryCalculator implements SalaryCalculator {
    private final double monthlySalary;

    public FixedSalaryCalculator(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
