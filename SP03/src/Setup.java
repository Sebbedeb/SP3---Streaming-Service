import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class Setup {
    public static void signUp() {
        String input = "temp";
        String username;
        String password;
        ArrayList<String> showsSeen = new ArrayList<>();
        ArrayList<String> favouriteShows = new ArrayList<>();
        username = input;
        password = input;
        User newUser = new User(username, password, showsSeen, favouriteShows);
        IDandPassword.addUser(newUser);
    }
}