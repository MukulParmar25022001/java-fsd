package exceptionPractices;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("default constructor");
	}
	public ConstructorDemo(int a) {
		System.out.println("parametrized constructor");
		System.out.println(a);
	}
	public ConstructorDemo(int a, int b) {
		System.out.println("parametrized constructor");
		System.out.println("parametrized constructor" + a);
		System.out.println("parametrized constructor" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(10);
		ConstructorDemo obj2 = new ConstructorDemo(10,20);
		

	}

}
