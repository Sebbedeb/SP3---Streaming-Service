import org.w3c.dom.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Setup
{
    private FileIO fileIO = new FileIO();
    public static void signUp()
    {
        String input = "temp";
        String username;
        String password;
        ArrayList<String> showsSeen = new ArrayList<>();
        ArrayList<String> favouriteShows = new ArrayList<>();
        //TextUI.signUp();
        //TextUI.newUsername();
        //fileIO.readUserData();
        username = input;
        //TextUI.newPassword();
        //fileIO.readUserData;
        password = input;
        User newUser = new User(username, password, showsSeen, favouriteShows);
        //TextUI.finishSignUp(newUser);
        //fileIO.pressAnything;

        IDandPassword.addUser(newUser);
    }

    public static void login()
    {
        HashMap thisID = new HashMap();
        //TextUI.loginUsername();
        //String input1 = fileIO.readUserData();
        //TextUI.loginPassword();
        //String input2 = fileIO.readUserData();
        //thisID.put(input1,input2);

    }
}