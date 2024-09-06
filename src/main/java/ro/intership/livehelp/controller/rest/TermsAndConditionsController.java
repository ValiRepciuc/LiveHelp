package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TermsAndConditionsController {
	@GetMapping("/terms-and-conditions")
    public String showLoginPage() {
        return "terms-and-conditions"; // This refers to /WEB-INF/views/login.jsp
    }
}
