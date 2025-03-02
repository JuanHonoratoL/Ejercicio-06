package UPIIZ.Ejercicio._6.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Api")
public class HomeController {

    @GetMapping
    public String home() {
        return "index";
    }
}
