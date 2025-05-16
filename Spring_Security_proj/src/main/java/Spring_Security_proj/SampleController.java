package Spring_Security_proj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @RequestMapping("/")
	public String  getHome() {
	return  "home.jsp";	
			
	}
    
}
