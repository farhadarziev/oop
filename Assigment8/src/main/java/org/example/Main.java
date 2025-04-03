package org.example;
import org.example.dao.EmployeeDAO;
import org.example.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();


        Employee emp = new Employee("Alice", "Developer", 75000, "2025-04-03");
        dao.insert(emp);
        System.out.println("Added: " + emp);

        Employee fetchedEmp = dao.getById(emp.getId());
        System.out.println("Found: " + fetchedEmp);

        emp.setSalary(80000);
        dao.update(emp);
        System.out.println("Updated: " + dao.getById(emp.getId()));

        System.out.println("List of employees: " + dao.getAll());

        dao.delete(emp.getId());
        System.out.println("Employee removed ID: " + emp.getId());
    }
}
