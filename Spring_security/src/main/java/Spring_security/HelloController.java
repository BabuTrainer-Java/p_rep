package Spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, this is a secured endpoint!";
    }
    @GetMapping("/hello")
    public String hello2() {
        return "Hello, this is a secured Hello endpoint!";
    }
    @GetMapping("/bye")
    public String bye() {
        return "this is a bye  endpoint!";
    }
    
    
}
