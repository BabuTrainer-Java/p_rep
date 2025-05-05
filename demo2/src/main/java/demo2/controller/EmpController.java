package demo2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo2.model.Emp;
import demo2.services.Emp_Service;

@RestController
public class EmpController {
@Autowired
Emp_Service  services;
@RequestMapping("/add")
@ResponseBody
public String  getEmp(Emp e)
{
e.setEname("kamal");
e.setEsal(16000);
return  services.empSave(e);
}	
@RequestMapping("/empall")
public List<Emp> getAll(){
	return services.empAll();
}
@RequestMapping("/empall/{eid}")
public Optional<Emp> getById(@PathVariable("eid") int  eid) {
return services.empById(eid);	
}
}
