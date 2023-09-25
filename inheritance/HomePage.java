package inheritance;

public class HomePage extends  Base{
	public void Homepagetest() {
		System.out.println("test for homepage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage obj =new HomePage();
		obj.openbrowser("chrome");
		login("mukul", "stu@12");
		obj.Homepagetest();
		obj.logout();

	}

}
