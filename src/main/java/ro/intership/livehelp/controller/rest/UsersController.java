package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UsersController {
	@GetMapping("/users")
    public String showLoginPage() {
        return "users"; // This refers to /WEB-INF/views/login.jsp
    }
}
