package xml.employeemanagement;

import java.io.File;
import java.util.List;

import data.employee.Employee;
import data.employee.Employees; 
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class XmlHandler {  
    public static List<Employee> getEmployee(){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();   
            Employees employees = (Employees) unmarshaller.unmarshal(new File("src\\xml\\employeemanagement\\employees.xml"));
            List<Employee> employeeList = employees.getEmployees();
            return employeeList;
        } catch (JAXBException e) {
        }
       return null;
    }
}
