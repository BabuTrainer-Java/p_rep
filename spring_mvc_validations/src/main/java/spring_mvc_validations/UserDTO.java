package spring_mvc_validations;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDTO {
	@NotBlank(message = "Name is required")
	@Size(min = 2, max = 30, message = "Name must be 2 to 30 characters")
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    @Email(message = "Invalid email format")
	private String email;
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 60, message = "Age must be at most 60")
	private int age;
	@Pattern(regexp = "\\d{10}", message = "Phone must be 10 digits")
	private String phone;


}
