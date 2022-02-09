package main.employeemanagement;

import java.util.List;

import data.employee.Employee;
import database.employeemanagement.DataBaseHandler;
import on.employeemanagement.GenerateSalarySlip;
import xml.employeemanagement.XmlHandler;


public class EmployeeManagementMain {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = XmlHandler.getEmployee();
        DataBaseHandler.sendToDatabase(employees);
        GenerateSalarySlip.printSalarySlip(employees);
    }    
}
