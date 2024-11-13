package model;

import calculator.DailyRateSalaryCalculator;

public class DailyRateEmployee extends Employee {
    public DailyRateEmployee(String firstName, String lastName, double dailyRate, int workingDays) {
        super(firstName, lastName, new DailyRateSalaryCalculator(dailyRate, workingDays));
    }
}
