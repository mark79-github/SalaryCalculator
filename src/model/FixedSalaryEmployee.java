package model;

import calculator.FixedSalaryCalculator;

public class FixedSalaryEmployee extends Employee {
    public FixedSalaryEmployee(String firstName, String lastName, double monthlySalary) {
        super(firstName, lastName, new FixedSalaryCalculator(monthlySalary));
    }
}
