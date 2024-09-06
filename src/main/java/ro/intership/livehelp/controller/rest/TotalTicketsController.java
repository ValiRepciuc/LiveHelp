package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TotalTicketsController {
	@GetMapping("/total-tickets")
    public String showLoginPage() {
        return "total-tickets"; // This refers to /WEB-INF/views/login.jsp
    }
}