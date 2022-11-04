import org.w3c.dom.Text;

import java.util.ArrayList;

public class StartMenu
{
    static ArrayList<String> registeredUsers = new ArrayList<>();
    static void setup() {

        loginScreen();
    }

    private static void loginScreen() {

    }

    static ArrayList<String> getRegisteredUsers(){
        return registeredUsers;
    }

}
