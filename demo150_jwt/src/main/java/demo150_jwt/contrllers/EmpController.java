package demo150_jwt.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
@RequestMapping("/login")
	public String  Login() {
		return  "welcome Form";
	}

@RequestMapping("/sus")
public String  Login_sus() {
	return  "welcome  susfully login";
}
	
}
