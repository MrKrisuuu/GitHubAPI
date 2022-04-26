package allegro.githubapi;

import java.util.HashMap;
import org.json.*;

public class Repository {
    private String owner;
    private String name;
    private HashMap<String, Integer> languages;


    public Repository(String owner, String name){
        this.owner = owner;
        this.name = name;
        this.updateLanguages();
    }

    public void updateLanguages(){
        String url = "https://api.github.com/repos/" + this.owner + "/" + this.name + "/languages";
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        JSONReaderFromURL reader = new JSONReaderFromURL();
        JSONObject json = reader.readObjectFromURL(url);

        String[] keys = JSONObject.getNames(json);
        for (String key : keys) {
            int value = json.getInt(key);
            result.put(key, value);
        }

        this.languages = result;
    }

    public HashMap<String, Integer> getLanguages(){
        return this.languages;
    }

    public String toString(){
        return this.name + ": " + this.getLanguages();
    }
}
