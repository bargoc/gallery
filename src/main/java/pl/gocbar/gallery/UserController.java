package pl.gocbar.gallery;

import java.util.ArrayList;
import java.util.List;

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
    
  //http://localhost:8080/message-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
    	model.addAttribute("id", 1);
        return "link-expression";
    }
  
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "male");
        User michal = new User("Michal", "michal@gmail.com", "USER", "male");
        User ewa = new User("Ewa", "hania@gmail.com", "USER", "female");
        User hania = new User("Hania", "ewa@gmail.com", "USER", "female");
        List<User> usersList = new ArrayList<User>();
        usersList.add(admin);
        usersList.add(michal);
        usersList.add(hania);
        usersList.add(ewa);
    	model.addAttribute("usersList", usersList);
        return "usersList";
    }

    @GetMapping("if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "male");
        User michal = new User("Michal", "michal@gmail.com", "USER", "male");
        User ewa = new User("Ewa", "hania@gmail.com", "USER", "female");
        User hania = new User("Hania", "ewa@gmail.com", "USER", "female");
        List<User> usersList = new ArrayList<User>();
        usersList.add(admin);
        usersList.add(michal);
        usersList.add(hania);
        usersList.add(ewa);
    	model.addAttribute("usersList", usersList);
        return "ifUnless";
    }

    @GetMapping("switch-case")
    public String switchcase(Model model) {
        User user = new User("Admin", "admin@gmail.com", "ADMIN", "male");
    	model.addAttribute("user", user);
        return "switch-case";
    }

    
}
