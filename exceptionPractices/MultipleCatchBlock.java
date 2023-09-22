package exceptionPractices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("enter the number");
		int num1 = scan.nextInt();
		System.out.println("enter the another number");
		int num2 = scan.nextInt();
		int result = num1/num2;
		System.out.println("division of 2 number is" + result);
		}
	    catch(ArithmeticException e) {
	    	System.out.println("please do not enter 0 in denominator");
	    }
	    catch(InputMismatchException e) {
	    	System.out.println("please enter only integer values");
	    }

	}

}
