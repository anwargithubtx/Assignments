package Oct_02;

import java.util.ArrayList;

public class ColorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");

		if (colors.contains("Red") || colors.contains("Orange")) {
			System.out.println("Have dinner in a restaurant.");
		} else {
			System.out.println("Today is Friday.");
		}

	}

}
