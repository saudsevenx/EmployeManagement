package on.employeemanagement;

import java.util.List;

import data.employee.Employee;


public class GenerateSalarySlip {
    private static int baseSalary = 12500;
    public static void printSalarySlip(List<Employee> employees){
        for(Employee employee: employees){
            System.out.println("Emp ID: " + employee.getId());
            System.out.println("Name: " + employee.getFname() + " " + employee.getLname());
            System.out.println("Salary: " + baseSalary );
            System.out.println("------------------------------------------------------------");
        }
    
    }
}