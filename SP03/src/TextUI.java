public class TextUI
{
    public static void loginOrSignUp() {
        System.out.println("Do you want to log in as an existing user, or do you want to sign up as a new User?");
    }

    public static void welcome() {
        System.out.println("Welcome to Streaming, the world's #1 streaming service.");
        System.out.println();
    }

    public static void signUp() {
        System.out.println("Good call joining Streaming. Let's get started on signing you up.");
    }

    public static void newUsername() {
        System.out.println("First, we need you to enter your new Username.");
    }

    public static void newPassword() {
        System.out.println("Please enter a password. Remember to write it down somewhere safe, so you won't forget.");
    }

    public static void finishSignUp(User newUser) {
        System.out.println("Perfect! You're all set up and ready to go");
        System.out.println("Your username is "+ newUser.getUsername+".");
        System.out.println("Your password is "+ newUser.getPassword+".");
        System.out.println("Press ANY button to return to the Main Menu.");
    }
}
