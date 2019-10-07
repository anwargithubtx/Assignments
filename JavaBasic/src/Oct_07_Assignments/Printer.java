package Oct_07_Assignments;

public class Printer {

	public String printName() {
		String name = "My name is Bond, James Bond!";
		System.out.println(name);
		return name;
	}

	public int printAge() {
		int age = 007;
		String ageToString = String.format("%03d", age);

		System.out.println("My age is " + ageToString+".");
		return age;
	}

	public static void main(String[] args) {
		Printer print = new Printer();
		print.printName();
		print.printAge();
	}

}
