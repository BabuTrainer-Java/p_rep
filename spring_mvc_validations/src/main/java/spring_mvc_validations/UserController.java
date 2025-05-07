package spring_mvc_validations;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @PostMapping
	public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO) {
	return ResponseEntity.ok("User created successfully!");
	}
		
}
