package rpncalc2;

import java.util.Scanner;

public class RPNCalcProgram {

	public static void main(String[] args) {
		RPNCalc rpncalc = new RPNCalc();
		Scanner scanner = new Scanner(System.in);
		
		String line = "start";
		while (line.length() != 0) {
			System.out.println("Støttede operatorer er: + (addisjon), - (substraksjon), * (multiplikasjon), / (divisjon), ~ (bytt plass)");
			line = scanner.nextLine();
			try {
				double number = Double.parseDouble(line);
				rpncalc.push(number);
			} catch (NumberFormatException e) {
				rpncalc.performOperation(line.charAt(0));
			}
			System.out.println(rpncalc);
		}
		scanner.close();
	}

}
