package allegro.githubapi;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JSONReaderFromURL {

    public JSONObject readObjectFromURL(String url){
        JSONObject json = null;
        try {
            InputStream stream = new URL(url).openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            String jsonText = readText(reader);
            json = new JSONObject(jsonText);
        } catch(Exception e){
            e.printStackTrace();
        }
        return json;
    }

    public JSONArray readArrayFromURL(String url){
        JSONArray json = null;
        try {
            InputStream stream = new URL(url).openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            String jsonText = readText(reader);
            json = new JSONArray(jsonText);
        } catch(Exception e){
            e.printStackTrace();
        }
        return json;
    }

    private String readText(Reader reader) throws IOException {
        StringBuilder result = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            result.append((char) c);
        }
        return result.toString();
    }
}
