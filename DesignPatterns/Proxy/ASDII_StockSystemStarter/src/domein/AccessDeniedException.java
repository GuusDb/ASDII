package domein;

public class AccessDeniedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccessDeniedException() {
        super("Access Denied : No permission to invoke");
    }
}