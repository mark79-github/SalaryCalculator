import calculator.DailyRateSalaryCalculator;
import model.DailyRateEmployee;
import model.Employee;
import model.FixedSalaryEmployee;

public class Main {
    public static void main(String[] args) {
        Employee fixedEmp = new FixedSalaryEmployee("John", "Doe", 3000);
        Employee dailyEmp = new DailyRateEmployee("Jane", "Smith", 150, 25);

        System.out.println("Fixed rate employee salary: $" + fixedEmp.calculateSalary());
        System.out.println("Daily rate employee salary: $" + dailyEmp.calculateSalary());

        fixedEmp.setSalaryCalculator(new DailyRateSalaryCalculator(100, 20));
        System.out.println("New salary for fixed-rate employee (using daily rate): $" + fixedEmp.calculateSalary());
    }
}
