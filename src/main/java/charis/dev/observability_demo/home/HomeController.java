package charis.dev.observability_demo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("")
    public String home() {
        return "Welcome to the Observability Demo Application!";
    }
}
