package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SignUpController {
	@GetMapping("/sign-up")
    public String showLoginPage() {
        return "sign-up"; // This refers to /WEB-INF/views/login.jsp
    }
}
