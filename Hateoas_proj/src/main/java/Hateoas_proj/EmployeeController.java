package Hateoas_proj;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private static final List<Employee> EMPLOYEES = List.of(
	        new Employee(1L, "Alice", "Developer"),
	        new Employee(2L, "Bob", "Manager"),
	        new Employee(3L, "nani", "hyd")
	         );

	@GetMapping("/{id}")
    public EntityModel<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = EMPLOYEES.stream()
            .filter(e -> e.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Employee not found"));

        return EntityModel.of(employee,
            linkTo(methodOn(EmployeeController.class).getEmployeeById(id)).withSelfRel(),
            linkTo(methodOn(EmployeeController.class).getAllEmployees()).withRel("all-employees")
        );
    }

	
	@GetMapping
    public CollectionModel<EntityModel<Employee>> getAllEmployees() {
        List<EntityModel<Employee>> employeeModels = EMPLOYEES.stream()
            .map(emp -> EntityModel.of(emp,
                linkTo(methodOn(EmployeeController.class).getEmployeeById(emp.getId())).withSelfRel()))
            .toList();

        return CollectionModel.of(employeeModels,
            linkTo(methodOn(EmployeeController.class).getAllEmployees()).withSelfRel());
    }

}
