package kgriffithTarifa;

import static sbcc.Core.*;
import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;
import java.util.Scanner;

public class Main {

	public static int Calculator(int megaBytesPerMonth, int numberOfMonths, int megaBytesSpentDuringMonths) {
		int result = 0;
		int totalmegaBytesAvailableBeforeSpending = megaBytesPerMonth * numberOfMonths;
		int totalmegaBytesAvailableAfterSpending = totalmegaBytesAvailableBeforeSpending - megaBytesSpentDuringMonths;
		result = totalmegaBytesAvailableAfterSpending + megaBytesPerMonth;
		return result;
	}


	public static void main(String[] args) {
		int megaBytesPerMonth;
		int numberOfMonths;
		int megaBytesSpentDuringMonths = 0;
		Scanner in = new Scanner(System.in);
		megaBytesPerMonth = in.nextInt();
		numberOfMonths = in.nextInt();
		in.useDelimiter(System.getProperty("line.separator"));

		while (in.hasNextInt()) {
			megaBytesSpentDuringMonths = megaBytesSpentDuringMonths + in.nextInt();
		}
		System.out.println(Calculator(megaBytesPerMonth, numberOfMonths, megaBytesSpentDuringMonths));
	}

}
