package skypro.service;

import skypro.dao.EmployeeDAO;
import skypro.entity.Employee;
//import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import skypro.exceptions.EmployeeException;

import javax.transaction.Transactional;
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
        if(employee == null){
            throw new EmployeeException("Employee with id " + " is not here");
        }
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
        if(employee == null){
            throw new EmployeeException("Employee with id " + " is not here");
        }
    employeeDAO.deleteEmployee(id);
    }


}
