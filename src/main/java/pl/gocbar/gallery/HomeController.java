package pl.gocbar.gallery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String home(Model model) {
		model.addAttribute("message", "Hello world");
		return "hello-world";
	}
}
