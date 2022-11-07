public class FedFlix
{
    User user = null;
    public void runFedFlix()
    {
        setUp();
        mainMenu(/* user */);
    }

    private User setUp()
    {
        SetUp setUp = new SetUp();
        User currentUser = setUp.runSetUp();
        return currentUser;
    }

    private void mainMenu() // takes a user in the constructor
    {
        MainMenu mainMenu = new MainMenu(user);
        mainMenu.runMainMenu();
    }
}
