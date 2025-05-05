package demo2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo2.dao.EmpRepo;
import demo2.model.Emp;
@Service
public class Emp_Service {
@Autowired
EmpRepo  repo;	
public String empSave(Emp  e) {
	repo.save(e);
	return "inserted SuccessFully";
}
public List<Emp> empAll(){
	return repo.findAll();
}
public Optional<Emp>  empById(Integer  id) {
	
	return repo.findById(id);
}

}
