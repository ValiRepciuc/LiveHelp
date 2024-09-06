package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HistoryController {
	@GetMapping("/history")
    public String showLoginPage() {
        return "history"; // This refers to /WEB-INF/views/login.jsp
    }
}
