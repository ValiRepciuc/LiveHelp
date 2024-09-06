package ro.intership.livehelp.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("/homepage")
    public String showLoginPage() {
        return "homepage"; // This refers to /WEB-INF/views/login.jsp
    }
}
