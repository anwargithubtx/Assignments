package Oct_03;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scan scan = new Scan();
		scan.input();
	}

	public void input() {
		Scanner obj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter your name here: ");
		String userInput = obj.nextLine(); // Read user input
		System.out.println("You have entered your name as " + userInput);

	}

}
