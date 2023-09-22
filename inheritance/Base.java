package inheritance;

public class Base {
	
	public void openbrowser(String browser) {
		System.out.println("open the browser" + browser);
	}
	public static void login(String username, String password) {
		System.out.println("enter your user name " + username);
		System.out.println("enter password " + password);
		System.out.println("sign into mailbox"  );
	}
	public void composeEmail(String text) {
		System.out.println("compose an email with text as " + text);
	}
	public void logout() {
		System.out.println("logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
