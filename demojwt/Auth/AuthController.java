package hooperdevelopment.demojwt.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("login")
    public String login() {
        return "login from public endpoint";
    }

    @PostMapping("register")
    public String register() {
        return "register from public endpoint";
    }
}
