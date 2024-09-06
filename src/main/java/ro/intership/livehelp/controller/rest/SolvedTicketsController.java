package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SolvedTicketsController {
	@GetMapping("/solved-tickets")
    public String showLoginPage() {
        return "solved-tickets"; // This refers to /WEB-INF/views/login.jsp
    }
}