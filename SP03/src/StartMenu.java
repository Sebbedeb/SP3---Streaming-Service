import org.w3c.dom.Text;

import java.util.ArrayList;

public class StartMenu
{
    static ArrayList<String> registeredUsers = new ArrayList<>();
    static void setup() {
        TextUI.welcome();
        loginScreen();
    }

    private static void loginScreen() {
        TextUI.loginOrSignUp();
        FileIO.readUserData();
        if(input == 1 || input.equals "login"){
            Setup.login();
        }
        else if(input == 2 || input.equals "sign up"){
            Setup.signUp();
        }
        else{
            ExceptionCatcher.wrongInput();
        }*/
    }

    static ArrayList<String> getRegisteredUsers(){
        return registeredUsers;
    }

}
