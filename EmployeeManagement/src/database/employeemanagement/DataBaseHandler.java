package database.employeemanagement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.employee.Employee;



public class DataBaseHandler {
    public static String url = "jdbc:mysql://localhost:3306/employee";
    public static String username = "root";
    public static String password = "Saja1123@";
    public static Employee tempEmployee = null;

    public static List<Employee> getFromDatabase(){
        List<Employee> employees = new ArrayList<>();
        try { 
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `employee`.`employees`");   

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String fname = resultSet.getString("fname");
                String lname = resultSet.getString("lname");
                employees.add(new Employee(id, fname, lname));
            }
            con.close();
        } catch (Exception e) {
        }
        return employees;
    }
    public static void sendToDatabase(List <Employee> employees) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            for(Employee employee: employees){
            String Query = String.format("INSERT INTO `employee`.`employees` (`id`, `fname`, `lname`) VALUES (null, '%s', '%s')"
                                        ,employee.getFname(), employee.getLname());
            statement.executeUpdate(Query); 
            }       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

