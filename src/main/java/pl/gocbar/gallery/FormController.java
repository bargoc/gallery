package pl.gocbar.gallery;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import pl.gocbar.gallery.model.UserForm;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }

}
