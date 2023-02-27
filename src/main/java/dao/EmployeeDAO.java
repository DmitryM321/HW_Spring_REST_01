package dao;

import entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployee();
    Employee getEmpoloyeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

}
