package pl.gocbar.gallery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.gocbar.gallery.model.User;



@Controller
public class UserController {
    
    //http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Ewa",  "ewka@gmail.com", "Admin", "femine");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Ewa",  "ewka@gmail.com", "Admin", "femine");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }
    
}
