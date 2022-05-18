package example.githubapi.website;

import example.githubapi.data.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/{name}")
    public ResultDTO usernameResult(@PathVariable(value="name") String name){
        User resultUser = new User(name);
        return new ResultDTO(resultUser);
    }
}
