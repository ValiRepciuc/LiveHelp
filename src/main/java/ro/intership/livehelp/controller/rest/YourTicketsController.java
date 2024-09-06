package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class YourTicketsController {
	@GetMapping("/your-tickets")
    public String showYourTicketsPage() {
        return "your-tickets"; // This refers to /WEB-INF/views/login.jsp
    }
}
