package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RespondTicketController {
	@GetMapping("/respond-ticket")
    public String showLoginPage() {
        return "respond-ticket"; // This refers to /WEB-INF/views/login.jsp
    }
}
