package allegro.githubapi;

public class UserData {
    private String login;
    private String name;
    private String bio;

    public UserData(String login, String name, String bio){
        this.login = login;
        this.name = name;
        this.bio = bio;
    }

    public String getLogin(){
        return this.login;
    }

    public String getName(){
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }

    public String toString(){
        return
                "Login: "+this.getLogin()+" "+
                "Name: "+this.getName()+" "+
                "Bio: "+this.getBio();
    }
}
