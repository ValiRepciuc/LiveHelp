package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UnsolvedTicketsController {
	@GetMapping("/unsolved-tickets")
    public String showLoginPage() {
        return "unsolved-tickets"; // This refers to /WEB-INF/views/login.jsp
    }
}