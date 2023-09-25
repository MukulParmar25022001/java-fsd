package exceptionPractices;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9;
		int j = 0;
		try {
			System.out.println("result" + i/j);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("result" + i+j);
		System.out.println("result" + (i -j));
		System.out.println("result" + i*j);

	}

}
