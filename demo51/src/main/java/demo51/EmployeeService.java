package demo51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        System.out.println("Created By: " + savedEmployee.getCreatedBy());
        System.out.println("Created Date: " + savedEmployee.getCreatedDate());
        return savedEmployee;
    }
}
