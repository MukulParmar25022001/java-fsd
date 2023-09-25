package exceptionPractices;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9;
		int j = 0;
		try {
			System.out.println("result" + i/j);
		}
		finally {
			System.out.println("result" + i+j);
			System.out.println("result" + (i-j));
			System.out.println("result" + i*j);
			
		}

	}

}
