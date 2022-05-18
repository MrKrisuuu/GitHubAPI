package example.githubapi.website;

import example.githubapi.data.Repository;
import example.githubapi.data.User;

import java.util.HashMap;
import java.util.List;

public class ResultDTO {
    private String login;
    private String name;
    private String bio;
    private HashMap<String, Integer> languages;
    private List<Repository> repositories;


    public ResultDTO(User user){
        this.login = user.getData().getLogin();
        this.name = user.getData().getName();
        this.bio = user.getData().getBio();
        this.languages = user.getLanguages();
        this.repositories = user.getRepositories();
    }

}
