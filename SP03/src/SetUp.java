import java.util.Scanner;

public class SetUp
{

    FileIO fileIO = new FileIO();

    Scanner scan = new Scanner(System.in);
    TextUI textUI = new TextUI();



    protected void runSetUp()
    {
        textUI.displayMessage("Welcome to fedFlix! Press 1 to register new user, or press 2 for login");
        String choice = textUI.getUserInput();

        if(choice.equals("1"))
        {
            register();
        }
        else
        {
            login();
        }


    }

    private User register()
    {
        textUI.displayMessage("Register new user:");
        String name = textUI.getUserInput("Username: ");
        String pass = textUI.getUserInput("Password: ");
        User user = new User(name, pass);
        fileIO.writeUserData(user);
        return user;
    }

    protected User login()
    {
        textUI.displayMessage("Please write your username: ");
        String usernameInput = scan.nextLine();
        for(String i : fileIO.readUserData())
        {
            if(usernameInput.equals(i)) 
            {
                textUI.displayMessage("You want to log in to the user " + i);
                // retrun user with the name i ...

            }
            else
            {
                textUI.displayMessage("USER NOT FOUND !!!!!! ");
                break;
            }
        }




        return null;
    }


}
