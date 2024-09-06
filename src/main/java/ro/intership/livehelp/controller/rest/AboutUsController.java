package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutUsController {
	@GetMapping("/about-us")
    public String showLoginPage() {
        return "about-us"; // This refers to /WEB-INF/views/login.jsp
    }
}
