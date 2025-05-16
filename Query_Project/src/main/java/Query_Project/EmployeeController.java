package Query_Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
    private EmployeeService service;

     	@PostMapping
	    public Employee saveEmployee(@RequestBody Employee employee) {
	        return service.saveEmployee(employee);
	    }
     	
     	@PostMapping("/bulk")
     	public List<Employee> saveEmployees(@RequestBody List<Employee> employees) {
     	    return service.saveEmployees(employees);
     	}

     	
     	@GetMapping("/department/{department}")
        public List<Employee> getByDepartment(@PathVariable String department) {
            return service.getByDepartment(department);
        }

        @GetMapping("/name/{name}")
        public List<Employee> getByName(@PathVariable String name) {
            return service.getByName(name);
        }

        @GetMapping("/native/department/{department}")
        public List<Employee> getByDepartmentNative(@PathVariable String department) {
            return service.getByDepartmentNative(department);
        }

        @PutMapping("/update-department")
        public String updateDepartment(@RequestParam String name, @RequestParam String department) {
            int count = service.updateDepartment(name, department);
            return count + " record(s) updated";
        }

        


}
