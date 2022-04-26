package allegro.githubapi;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JSONReaderFromURL {

    public JSONObject readObjectFromURL(String url){
        InputStream stream;
        BufferedReader reader;
        String jsonText;
        JSONObject json = null;
        try {
            stream = new URL(url).openStream();
            reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            jsonText = readText(reader);
            json = new JSONObject(jsonText);
        } catch(Exception e){
            e.printStackTrace();
        }
        return json;
    }

    public JSONArray readArrayFromURL(String url){
        InputStream stream;
        BufferedReader reader;
        String jsonText;
        JSONArray json = null;
        try {
            stream = new URL(url).openStream();
            reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
            jsonText = readText(reader);
            json = new JSONArray(jsonText);
        } catch(Exception e){
            e.printStackTrace();
        }
        return json;
    }

    private String readText(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
