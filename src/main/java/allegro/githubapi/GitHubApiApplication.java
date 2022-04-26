package allegro.githubapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubApiApplication.class, args);
    }

    @GetMapping()
    public String result(){
        User user = new User("MrKrisuuu");

        String result;
        result =
                user.getRepositories().toString()+" "+
                user.getData().toString()+" "+
                user.getLanguages().toString();
        return result;
    }
}
