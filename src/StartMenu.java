import org.w3c.dom.Text;

import java.util.ArrayList;

public class StartMenu
{
    public FileIO fileIO = new FileIO();
    static ArrayList<String> registeredUsers = new ArrayList<>();
    public void setup()
    {
        //TextUI.welcome();
        loginScreen();
    }

    public void loginScreen()
    {
        TextUI.loginOrSignUp();
        String input = fileIO.readUserData().toString();
        if(input.equals(1) || input.equals("login"))
        {
            Setup.login();
        }
        else if(input == 2 || input.equals "sign up")
        {
            Setup.signUp();
        }
        else
        {
            ExceptionCatcher.wrongInput();
        }
    }

    static ArrayList<String> getRegisteredUsers()
    {
        return registeredUsers;
    }

}
