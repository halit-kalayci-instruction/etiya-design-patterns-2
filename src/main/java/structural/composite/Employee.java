package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    private String name;
    private String surname;
    private String role;

    private List<Employee> subordinates;

    public Employee(String name, String surname, String role) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
    }
    public void removeSubordinate(Employee employee){
        subordinates.remove(employee);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
