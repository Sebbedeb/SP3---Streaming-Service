public class FedFlix
{
    User user;
    public void runFedFlix()
    {
        user = setUp();
        mainMenu(/* user */);
    }

    private User setUp()
    {
        SetUp setUp = new SetUp();
        setUp.runSetUp();
    }

    private void mainMenu() // takes a user in the constructor
    {
        // MainMenu mainMenu = new MainMenu(user);
        // mainMenu.runMainMenu();
    }
}
