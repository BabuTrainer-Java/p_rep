package Data_jpa_Projection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    // Interface-based projection
    List<EmployeeView> findByDepartment(String department);

    // Class-based projection using constructor expression
    @Query("SELECT new EmployeeDTO(e.name, e.salary) FROM Employee e WHERE e.department = :department")
    List<EmployeeDTO> findEmployeeDTOByDepartment(String department);
}
