package Query_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import  java.util.*;
@Service
public class EmployeeService {

	 @Autowired
	  private EmployeeRepository repository;

	 public Employee saveEmployee(Employee employee) {
		    return repository.save(employee);
		}

	 public List<Employee> saveEmployees(List<Employee> employees) {
		    return repository.saveAll(employees);
		}

	  
	 
	 
	    public List<Employee> getByDepartment(String department) {
	        return repository.findByDepartment(department);
	    }
	    
	    public List<Employee> getByName(String name) {
	        return repository.findByName(name);
	    }
	    
	    public List<Employee> getByDepartmentNative(String department) {
	        return repository.findByDepartmentNative(department);
	    }

	    @Transactional
	    public int updateDepartment(String name, String department) {
	        return repository.updateDepartmentByName(department, name);
	    }

	    



	
	
}
