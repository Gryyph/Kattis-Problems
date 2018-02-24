package changemyname;

import java.util.Scanner;

public class Main {

	public static String ahCounter(String johnInput, String doctorInput) {
		char[] johnArray = johnInput.toCharArray();
		char[] doctorArray = doctorInput.toCharArray();
		int i = 0;
		int j = 0;
		int johnCount = 0;
		int doctorCount = 0;
		String result = "";
		while (johnArray[i] != 'h') {
			johnCount++;
			i++;
		}

		while (doctorArray[j] != 'h') {
			doctorCount++;
			j++;
		}

		if (johnCount >= doctorCount) {
			result = "go";
		} else if (johnCount < doctorCount) {
			result = "no";
		} else {
			;
		}
		return result;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String johnInput = in.nextLine();
		String doctorInput = in.nextLine();
		in.close();
		System.out.println(ahCounter(johnInput, doctorInput));
	}

}
