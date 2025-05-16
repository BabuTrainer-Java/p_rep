package jpa_projection_proj;

public interface EmployeeWithDepartment {
	String getName();
    DepartmentInfo getDepartment();

    interface DepartmentInfo {
        String getName();
    }	
}
