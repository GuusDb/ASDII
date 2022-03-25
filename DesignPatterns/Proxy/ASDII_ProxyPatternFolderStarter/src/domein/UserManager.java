package domein;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserManager {

	private Map<String, User> userMap;
	private Set<User> userWithFolderAccess;

	public UserManager() {
		userMap = new HashMap<>();
		userWithFolderAccess = new HashSet<>();
	}

	public boolean hasFolderAccess(User user) {
		return userWithFolderAccess.contains(user);
	}

	public User getUser(String name, String passwd) {
		User user = userMap.get(name);
		if (user == null) {
			return null;
		}
		if (user.passwdValid(passwd)) {
			return user;
		}
		return null;
	}

	public void addUser(User user, boolean folderAccess) {
		userMap.put(user.getUserName(), user);
		if (folderAccess) {
			userWithFolderAccess.add(user);
		}
	}
}