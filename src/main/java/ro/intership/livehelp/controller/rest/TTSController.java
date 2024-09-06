package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TTSController {
	@GetMapping("/tickets-to-solve")
    public String showLoginPage() {
        return "tickets-to-solve"; // This refers to /WEB-INF/views/login.jsp
    }
}