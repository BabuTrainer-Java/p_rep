package spring_mvc_validations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UController {

	@GetMapping("/register")
	public String showForm(Model model) {
	model.addAttribute("user", new User());
	return "register";
	}
	
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user") User user,
	BindingResult result) {

	if (result.hasErrors()) {
	return "register";
	}
	return "success";
	}
	
}
