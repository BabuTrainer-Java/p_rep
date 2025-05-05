package demo2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo2.model.Emp;
@Repository
public interface EmpRepo   extends  JpaRepository<Emp,Integer>{

}
