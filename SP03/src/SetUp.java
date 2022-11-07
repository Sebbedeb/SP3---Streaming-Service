public class SetUp
{
    TextUI textUI = new TextUI();

    protected User runSetUp()
    {
        textUI.displayMessage("Welcome to fedFlix! Press 1 to register new user, or press 2 for login");
        String choice = textUI.getUserInput();
        User user = null;

        if(choice.equals("1"))
        {
           user = register();
        }
        else
        {
            //user = login();
        }

        return user;
    }

    private User register()
    {
        FileIO fileIO = new FileIO();
        textUI.displayMessage("Register new user:");
        String name = textUI.getUserInput("Username: ");
        String pass = textUI.getUserInput("Password: ");
        User user = new User(name, pass);
        fileIO.writeUserData(user);
        return user;
    }


}
