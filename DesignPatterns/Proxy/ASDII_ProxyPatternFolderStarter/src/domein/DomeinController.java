package domein;

public class DomeinController {

    private UserManager userManager;
    private Folder folder;

    public DomeinController() {
        initUserManager();
        folder = new Folder();
    }

    public String performFolderOperation(String name, String passwd) {
        
        User user = userManager.getUser(name, passwd);
        if (user!=null){
//TODO _ maak gebruik van het proxypattern
            
            
//END TODO
        }
        
        return "Invalid user/passwd";
    }

    private void initUserManager() {
        userManager = new UserManager();
        userManager.addUser(new User("Jan", "JanPass"), true);
        userManager.addUser(new User("Piet", "PietPass"), true);
        userManager.addUser(new User("Joris", "JorisPass"), false);
        userManager.addUser(new User("Corneel", "CorneelPass"), false);
    }
}