package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LiveHelpController {
	@GetMapping("/")
    public String showYourTicketsPage() {
        return "login"; // This refers to /WEB-INF/views/login.jsp
    }
}
