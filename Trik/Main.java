package trik;

//import static sbcc.Core.*;
//import static java.lang.System.*;
//import static org.apache.commons.lang3.StringUtils.*;
import java.util.Scanner;

public class Main {

	public static int Position(String input) {
		char[] array = input.toCharArray();
		int position = 1;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == 'A') {
				if (position == 1) {
					position = 2;

				} else if (position == 2) {
					position = 1;
				} else {
					;
				}

			} else if (array[i] == 'B') {
				if (position == 2) {
					position = 3;
				} else if (position == 3) {
					position = 2;
				} else {
					;
				}

			} else if (array[i] == 'C') {
				if (position == 1) {
					position = 3;

				} else if (position == 3) {
					position = 1;

				} else {
					;
				}

			} else {
				;
			}
		}

		return position;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		System.out.println(Position(input));
	}

}
