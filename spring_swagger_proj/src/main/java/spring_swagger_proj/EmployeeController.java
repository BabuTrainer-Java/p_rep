package spring_swagger_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/employees")
@Tag(name = "Employee API", description = "Operations related to Employees")
public class EmployeeController {
	 @Autowired
	 private EmployeeService employeeService;

	 @GetMapping
	    @Operation(summary = "Get all employees")
	    public List<Employee> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }
	 @GetMapping("/{id}")
	    @Operation(summary = "Get employee by ID")
	    public Employee getEmployeeById(@PathVariable Long id) {
	        return employeeService.getEmployeeById(id);
	    }
	 
	    @PostMapping
	    @Operation(summary = "Create a new employee")
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeService.createEmployee(employee);
	    }
	    
	    @DeleteMapping("/{id}")
	    @Operation(summary = "Delete employee by ID")
	    public void deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	    }


	 
	 


	
	
	
}
