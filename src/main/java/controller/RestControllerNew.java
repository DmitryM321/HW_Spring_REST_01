package controller;

import entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/skypro")
public class RestControllerNew {
    private EmployeeService employeeService;

    public RestControllerNew(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployee(){
    return employeeService.getEmployee();
    }

}
