package domein;

public class ProxyFolder implements AbstractFolder {

	private Folder folder; //The real subject
	private UserManager userManager;
	private User user;

	public String performOperations() {
		if(userManager.hasFolderAccess(user)) {
			return folder.performOperations();
		}
		return "You do not have access";
	}

	public ProxyFolder(Folder folder, User user, UserManager um) {
		this.folder = folder;
		this.user = user;
		this.userManager = um;
	}
}
