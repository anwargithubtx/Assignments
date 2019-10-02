package Demo;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void substract(int a, int b) {
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide (int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.substract(30, 20);
	}
	
	
}
