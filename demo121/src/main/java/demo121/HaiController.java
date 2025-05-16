package demo121;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hai-demo")
public class HaiController {

	@RequestMapping("/hai")
	public String getHai() {
		return "welcome Hai";
	}
}
