package Oct_02;

public class A {
	
	public String[] daysInAWeek() {
		String[] days = new String[3];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		return days;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		String[] allDays = a.daysInAWeek();
		System.out.println(allDays);

	}

}




