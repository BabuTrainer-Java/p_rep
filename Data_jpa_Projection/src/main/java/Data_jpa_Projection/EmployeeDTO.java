package Data_jpa_Projection;

public class EmployeeDTO {
    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	private Double salary;

    public EmployeeDTO(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    
}
