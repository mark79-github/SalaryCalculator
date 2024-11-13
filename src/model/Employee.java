package model;

import calculator.SalaryCalculator;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected SalaryCalculator salaryCalculator;

    protected Employee(String firstName, String lastName, SalaryCalculator salaryCalculator) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryCalculator = salaryCalculator;
    }

    public double calculateSalary() {
        return salaryCalculator.calculateSalary();
    }

    public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }
}
