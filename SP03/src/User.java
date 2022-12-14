import java.util.ArrayList;

public class User
{
    // make an arraylist the show the seen movies
    private ArrayList<String> showsSeen = new ArrayList<>();

    // make an arraylist with favouriteShows
    private ArrayList<String> favouriteShows = new ArrayList<>();

    // make a username
    private String username;

    // make a password
    private String password;


    // constructor for a new user where there is no showsSeen and favouriteShows.
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    // constructor for register user with showsSeen and favouriteShows
    public User(String username, String password, ArrayList<String> showsSeen, ArrayList<String> favouriteShows)
    {
        this.username = username;
        this.password = password;
        this.showsSeen = showsSeen;
        this.favouriteShows = favouriteShows;
    }

    // getters
    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public ArrayList<String> getShowsSeen()
    {
        return showsSeen;
    }

    public ArrayList<String> getFavouriteShows()
    {
        return favouriteShows;
    }

    // setters
    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setShowsSeen(ArrayList<String> showsSeen)
    {
        this.showsSeen = showsSeen;
    }

    public void setFavouriteShows(ArrayList<String> favouriteShows)
    {
        this.favouriteShows = favouriteShows;
    }


    // toString
    @Override
    public String toString()
    {
        return "Username: " + username + ", Password: " + password + ", Shows seen: " + showsSeen + ", Favourite shows: " + favouriteShows;
    }
}
