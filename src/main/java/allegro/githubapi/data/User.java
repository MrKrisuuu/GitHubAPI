package allegro.githubapi.data;

import allegro.githubapi.JSONHealper.JSONReaderFromURL;
import allegro.githubapi.results.UserResult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
    private String username;
    private UserData data;
    List<Repository> repositories;

    public User(UserResult user){
        this.username = user.getUsername();
        this.updateData();
        this.updateRepositories();
    }

    public void updateData(){
        try{
            String url = "https://api.github.com/users/" + this.username;
            JSONReaderFromURL reader = new JSONReaderFromURL();
            JSONObject json = reader.readObjectFromURL(url);

            String login = json.getString("login");
            String name = json.getString("name");
            Object bioToCheck = json.get("bio");
            String bio = bioToCheck.toString();

            this.data = new UserData(login, name, bio);
        } catch (Exception e){
            e.printStackTrace();
            this.data = new UserData("", "", "");
        }
    }

    public void updateRepositories(){
        List<Repository> result = new ArrayList<Repository>();
        try{
            String url = "https://api.github.com/users/" + this.username + "/repos";
            JSONReaderFromURL reader = new JSONReaderFromURL();
            JSONArray json = reader.readArrayFromURL(url);

            for (int i=0; i<json.length(); i++){
                String name = json.getJSONObject(i).getString("name");
                result.add(new Repository(this.username, name));
            }

            this.repositories = result;
        } catch (Exception e){
            e.printStackTrace();
            this.repositories = result;
        }

    }

    public UserData getData(){
        return this.data;
    }

    public List<Repository> getRepositories(){
        return this.repositories;
    }

    public HashMap<String, Integer> getLanguages(){
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (Repository repo : this.getRepositories()){
            HashMap<String, Integer> languages = repo.getLanguages();
            for (String language : languages.keySet()){
                if (result.containsKey(language)){
                    result.put(language, result.get(language) + languages.get(language));
                } else {
                    result.put(language, languages.get(language));
                }
            }
        }
        return result;
    }
}
