package example.githubapi.results;

import example.githubapi.data.Repository;
import example.githubapi.data.User;

import java.util.HashMap;
import java.util.List;

public class Result {
    private List<Repository> repositories;
    private String login;
    private String name;
    private String bio;
    private HashMap<String, Integer> languages;

    public Result(User user){
        this.repositories = user.getRepositories();
        this.login = user.getData().getLogin();
        this.name = user.getData().getName();
        this.bio = user.getData().getBio();
        this.languages = user.getLanguages();
    }

    public List<Repository> getRepositories(){
        return this.repositories;
    }

    public String getLogin(){
        return this.login;
    }

    public String getName(){
        return this.name;
    }

    public String getBio(){
        return this.bio;
    }

    public HashMap<String, Integer> getLanguages(){
        return this.languages;
    }
}
