package data.employee;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "employee")
@XmlAccessorType (XmlAccessType.FIELD)
public class Employee {
    private int id ;
    private String fname;
    private String lname;


    public Employee(){
        
    }

    public Employee(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
 
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    
}
