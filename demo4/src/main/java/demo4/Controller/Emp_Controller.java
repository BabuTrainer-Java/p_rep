package demo4.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo4.model.Emp;
import demo4.services.Emp_Services;

@RestController
public class Emp_Controller {
@Autowired
Emp_Services services;
@PostMapping("/emps")
public String empSave(@RequestBody  Emp  e) {
return services.saveEmp(e);	
}	
@GetMapping("/emps")
public List<Emp> empAll(){
	return  services.getEmpAll();
}
@GetMapping("/emps/{eid}")
public Emp getEmp1(@PathVariable("eid") int eid) {
	return  services.getEmp1(eid);
}
@DeleteMapping("/emps/{eid}")
public String getDelete(@PathVariable("eid") int eid) {
	return  services.getDelete(eid);
}
@DeleteMapping("/emps")
public String getDeleteAll() {
	return  services.getDeleteAll();
}
@PutMapping("/emps/{eid}")
public String getUpdate(@PathVariable("eid") int eid,@RequestBody Emp e) {
return  services.getEmpUpdate(eid, e);
}
}
