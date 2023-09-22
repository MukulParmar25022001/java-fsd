package inheritance;

public class Payments extends HomePage{
	public void payments() {
		System.out.println("test the payment page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments obj = new Payments();
		obj.openbrowser(" chrome");
		login("mukul", "stu@21");
		obj.payments();
		obj.logout();
		

	}

}
