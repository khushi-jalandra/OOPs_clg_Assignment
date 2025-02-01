package Assignment_2;

import java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    double basicSalary;
    double grossSalary;

    Employee(int empId, String empName, double basicSalary)
    {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        double allowances = basicSalary * 0.20; //Assuming allowances is 20% of the basic salary
        grossSalary = basicSalary + allowances;
    }

    public void displaySalary()
    {
        System.out.println("Gross Salary: $" + grossSalary);
    }
}

public class Question14 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        Employee employee = new Employee(empId, empName, basicSalary);
        employee.displaySalary();
    }
}
