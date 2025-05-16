package jpa_projection_proj;

public class EmployeeDTO {
	private String name;
    private String position;

    public EmployeeDTO(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }

}
