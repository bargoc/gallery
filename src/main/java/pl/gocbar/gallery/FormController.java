package pl.gocbar.gallery;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.gocbar.gallery.model.UserForm;

@Controller
public class FormController {

    @GetMapping("register")
    public String UserRegistration(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        List<String> listProffesion = Arrays.asList("Developer", "Tester", "Architect");   
        model.addAttribute("listProffesion", listProffesion);
        return "register-form";
    }
}
