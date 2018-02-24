package moosecounter;

import java.util.Scanner;

public class Main {

	public static String mooseStatus(int a, int b) {
		String result = "";
		if (a == 0 && b == 0) {
			result = "Not a moose";
		} else if (a == b) {
			result = "Even";
		} else if (a != b) {
			result = "Odd";
		} else {
			;
		}
		return result;

	}


	public static String MooseCalculator(int a, int b) {
		int result;
		String blankResult = "";
		if (a == 0 && b == 0) {
			return blankResult;
		} else if (a == b) {
			result = a + b;
			String stringResult = Integer.toString(result);
			return stringResult;
		} else if ((mooseStatus(a, b)) == "Odd" && a > b) {
			result = 2 * a;
			String stringResult = Integer.toString(result);
			return stringResult;

		} else if ((mooseStatus(a, b)) == "Odd" && b > a) {
			result = 2 * b;
			String stringResult = Integer.toString(result);
			return stringResult;
		}

		else {
			return blankResult;
		}

	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String initialInput = in.nextLine();
		in.close();
		String[] inputSplit = initialInput.split("\\s");
		int a = Integer.parseInt(inputSplit[0]);
		int b = Integer.parseInt(inputSplit[1]);

		System.out.println(mooseStatus(a, b) + " " + MooseCalculator(a, b));

	}

}
