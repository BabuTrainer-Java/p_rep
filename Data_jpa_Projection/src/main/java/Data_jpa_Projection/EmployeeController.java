package Data_jpa_Projection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }
    @GetMapping("/view/{department}")
    public List<EmployeeView> getEmployees(@PathVariable String department) {
        return employeeService.getEmployeesByDepartment(department);
    }

    @GetMapping("/dto/{department}")
    public List<EmployeeDTO> getEmployeeDTOs(@PathVariable String department) {
        return employeeService.getEmployeeDTOsByDepartment(department);
    }
}
