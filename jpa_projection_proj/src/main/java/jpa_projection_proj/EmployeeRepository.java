package jpa_projection_proj;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

	List<EmployeeNameView> findByPosition(String position);
	
	@Query("SELECT new jpa_projection_proj.EmployeeDTO(e.name, e.position) FROM Employee e")
    List<EmployeeDTO> fetchEmployeeDTO();

	<T> List<T> findByPosition(String position, Class<T> type);
	
	List<EmployeeWithDepartment> findAllBy();
	
	 @Query(value = "SELECT name, position FROM employee WHERE position = ?1", nativeQuery = true)
	  List<EmployeeNameView> getNativeProjection(String position);
	
}
