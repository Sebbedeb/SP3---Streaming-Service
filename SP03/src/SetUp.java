public class SetUp
{
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
            //login();
        }


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