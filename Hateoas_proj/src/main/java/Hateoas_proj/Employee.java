package Hateoas_proj;
import  java.util.*;
public class Employee {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private Long id;
    private String name;
    private String role;

    // Constructors
    public Employee(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

  
}
