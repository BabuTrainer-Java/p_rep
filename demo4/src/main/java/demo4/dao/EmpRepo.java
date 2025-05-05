package demo4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo4.model.Emp;
@Repository
public interface EmpRepo  extends JpaRepository<Emp,Integer> {

	
}
