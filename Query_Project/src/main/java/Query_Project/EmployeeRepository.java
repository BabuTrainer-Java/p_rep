package Query_Project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.department = ?1")
    List<Employee> findByDepartment(String department);
    
    // Named Parameter
    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findByName(@Param("name") String name);
    
 // Native Query
    @Query(value = "SELECT * FROM employee WHERE department = ?1", nativeQuery = true)
    List<Employee> findByDepartmentNative(String department);

    
    // Modifying Query
    @Modifying
    @Query("UPDATE Employee e SET e.department = :department WHERE e.name = :name")
    int updateDepartmentByName(@Param("department") String department, @Param("name") String name);

    
}