package allegro.githubapi.website;

import allegro.githubapi.results.Result;
import allegro.githubapi.data.User;
import allegro.githubapi.results.UserResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("")
    public String usernameForm(Model model){
        model.addAttribute("userResult", new UserResult());
        return "form";
    }


    @PostMapping("/results")
    public String usernameResult(@ModelAttribute UserResult user, Model model){
        Result result = new Result(new User(user));
        model.addAttribute("result", result);
        return "result";
    }
}
