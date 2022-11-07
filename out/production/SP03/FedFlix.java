public class FedFlix
{
    SetUp setUp = new SetUp();
    public void runFedFlix()
    {
        setUp();
        //mainMenu(setUp.login());

    }

    private User setUp()
    {
        SetUp setUp = new SetUp();
        setUp.runSetUp();
        User user = new User("temp", "temp");
        return user;
    }
}
