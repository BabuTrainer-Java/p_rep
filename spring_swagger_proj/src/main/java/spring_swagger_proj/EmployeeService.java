package spring_swagger_proj;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
	private final Map<Long, Employee> employeeRepo = new HashMap<>();
	public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeRepo.values());
    }
	public Employee getEmployeeById(Long id) {
        return employeeRepo.get(id);
    }
	
	public Employee createEmployee(Employee employee) {
        employeeRepo.put(employee.getId(), employee);
        return employee;
    }

	 public void deleteEmployee(Long id) {
	        employeeRepo.remove(id);
	    }
	
	
}
