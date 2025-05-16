package jpa_auduting_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
    private EmployeeRepository repository;

	@PostMapping
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }
	
	 @PutMapping("/{id}")
	    public Employee update(@PathVariable Long id, @RequestBody Employee newEmp) {
	        Employee emp = repository.findById(id).orElseThrow();
	        emp.setName(newEmp.getName());
	        emp.setDepartment(newEmp.getDepartment());
	        return repository.save(emp);
	    }

	 
	 @GetMapping
	    public List<Employee> getAll() {
	        return repository.findAll();
	    }
	
	

	

	
}
