package domein;

public class ProxyFolder implements AbstractFolder {

	private Folder folder;
	private UserManager userManager;
	private User user;

	public java.lang.String performOperations() {
		throw new UnsupportedOperationException();
	}

	public ProxyFolder(Folder folder, User user, UserManager um) {
		throw new UnsupportedOperationException();
	}
}
