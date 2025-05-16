package Data_jpa_Projection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
     
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeView> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public List<EmployeeDTO> getEmployeeDTOsByDepartment(String department) {
        return employeeRepository.findEmployeeDTOByDepartment(department);
    }
    public Employee saveEmployee(EmployeeDTO dto) {
        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setSalary(dto.getSalary());
        return employeeRepository.save(employee);
    }
    
}
