package training.day5;

import java.util.logging.Logger;

public class Employee {

    private String name; // required
    private float salary; // required
    private String phoneNumber; // required
    private String liscenceNumber; // optional

//    public Employee() {
//        Logger.getGlobal().info("Default Constructor Called");
//        this.name = "";
//        this.salary = 0;
//        this.phoneNumber = "";
//        this.liscenceNumber = "";
//    }

    public Employee(String name, float salary, String phoneNumber){
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        Logger.getGlobal().info("First Parameterized Constructor");
    }

    public Employee(String name, float salary, String phoneNumber, String liscenceNumber){
        this(name, salary, phoneNumber);
        this.liscenceNumber = liscenceNumber;
        Logger.getGlobal().info("Second Parameterized Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLiscenceNumber() {
        return liscenceNumber;
    }

    public void setLiscenceNumber(String liscenceNumber) {
        this.liscenceNumber = liscenceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", liscenceNumber='" + liscenceNumber + '\'' +
                '}';
    }
}
