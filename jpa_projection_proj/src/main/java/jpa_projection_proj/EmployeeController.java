package jpa_projection_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	 @Autowired 
	 private EmployeeRepository employeeRepository;
	   @Autowired 
	   private DepartmentRepository departmentRepository;

	   @PostMapping("/departments")
	    public Department createDepartment(@RequestBody Department department) {
	        return departmentRepository.save(department);
	    }

	    @PostMapping
	    public Employee save(@RequestBody Employee employee) {
	        Department dept = departmentRepository.findById(employee.getDepartment().getId())
	                .orElseThrow(() -> new RuntimeException("Department not found"));
	        employee.setDepartment(dept);
	        return employeeRepository.save(employee);
	    }

	   
	   
	   @GetMapping
	    public List<Employee> all() {
	        return employeeRepository.findAll();
	    }

	   @GetMapping("/dto")
	    public List<EmployeeDTO> getDTO() {
	        return employeeRepository.fetchEmployeeDTO();
	    }

	   @GetMapping("/interface")
	    public List<EmployeeNameView> getInterface(@RequestParam String position) {
	        return employeeRepository.findByPosition(position);
	    }

	   @GetMapping("/dynamic")
	    public List<EmployeeDTO> getDynamic(@RequestParam String position) {
	        return employeeRepository.findByPosition(position, EmployeeDTO.class);
	    }

	   @GetMapping("/nested")
	    public List<EmployeeWithDepartment> getNested() {
	        return employeeRepository.findAllBy();
	    }
	   
	    @GetMapping("/native")
	    public List<EmployeeNameView> getNative(@RequestParam String position) {
	        return employeeRepository.getNativeProjection(position);
	    }

}
