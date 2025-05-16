package demo91;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestParam String username) {
        return JwtUtil.generateToken(username);
    }

    @GetMapping("/secure-data")
    public String secureData(@RequestHeader("Authorization") String token) {
        if (JwtUtil.validateToken(token.replace("Bearer ", ""))) {
            return "Secure Data Accessed!";
        }
        return "Invalid Token!";
    }
}
