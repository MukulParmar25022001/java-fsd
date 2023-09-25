package inheritance;

public class MethodsDemo {

	public void login(String username, String password) {
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
		MethodsDemo obj = new MethodsDemo();
		obj.login("mukul", "student@123");
		obj.composeEmail("namste");
		

	}

}
