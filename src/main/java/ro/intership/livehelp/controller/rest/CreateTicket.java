package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CreateTicket {
	@GetMapping("/create-ticket")
    public String showLoginPage() {
        return "create-ticket"; // This refers to /WEB-INF/views/login.jsp
    }
}
