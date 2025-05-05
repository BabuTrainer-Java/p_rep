package demo4.services;

import java.lang.System.Logger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo4.dao.EmpRepo;
import demo4.model.Emp;

@Service
public class Emp_Services {
@Autowired
EmpRepo  repo;
public String  saveEmp(Emp e) {
repo.save(e);
return  "Inserted  new Record";
}
public  List<Emp> getEmpAll(){
	return    repo.findAll();
}
public Emp getEmp1(Integer  id) {
	return  repo.findById(id).orElse(null);
}
public  String  getDelete(Integer id) {
	repo.deleteById(id);
	return  "deleted  Sucessfully";
}
public String getDeleteAll() {
	repo.deleteAll();
	return  "deleted All Records";
}

public String  getEmpUpdate(Integer id,Emp e1)
{  
	Emp  e2=getEmp1(id);
	e2.setEname(e1.getEname());
	e2.setEsal(e1.getEsal());
	e2.setDname(e1.getDname());
	repo.save(e2);
	return  "update successfully";
	
	
}

	
}
