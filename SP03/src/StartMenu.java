public class StartMenu
{
<<<<<<< Updated upstream
=======
    static ArrayList<String> registeredUsers = new ArrayList<>();
    static void setup() {
        TextUI.welcome();
        loginScreen();
    }

    private static void loginScreen() {
        String input;
        TextUI.loginOrSignUp();
        input=FileIO.readUserData();
        if(input == 1 || input.equals "login"){
            Setup.login();
        }
        else if(input == 2 || input.equals "sign up"){
            Setup.signUp();
        }
        else{
            ExceptionCatcher.wrongInput();
        }
    }

    static ArrayList<String> getRegisteredUsers(){
        return registeredUsers;
    }

>>>>>>> Stashed changes
}
