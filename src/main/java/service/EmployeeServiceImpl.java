package service;

import dao.EmployeeDAO;
import entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    @Transactional
    public List<Employee> getEmployee() {
        return employeeDAO.getEmployee();
    }
    @Override
    @Transactional
    public Employee getEmpoloyeeById(int id) {
        Employee employee = employeeDAO.getEmpoloyeeById(id);
        return employee;
    }
    @Override
    @Transactional
    public void addEmployee(Employee employee) {
    employeeDAO.addEmployee(employee);
    }
    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
    employeeDAO.updateEmployee(employee);
    }
    @Override
    @Transactional
    public void deleteEmployee(int id) {
    Employee employee = employeeDAO.getEmpoloyeeById(id);
    employeeDAO.deleteEmployee(id);
    }
}
