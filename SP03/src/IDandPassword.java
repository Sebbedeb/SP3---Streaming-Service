import java.util.HashMap;

public class IDandPassword {
    private static HashMap<String, String> listOfUsers = new HashMap<String, String>();


    public static HashMap<String, String> getListOfUsers(){
        return listOfUsers;
    }
    public static void addUser(User user){
        IDandPassword.getListOfUsers();
        listOfUsers.put(user.getUsername , user.getPassword);
    }
}