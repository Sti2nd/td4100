package stringstack;

import java.util.Scanner;

public class StringStackProgram {

	public static void main(String[] args) {
		StringStack stringstack = new StringStack();
		Scanner scanner = new Scanner(System.in);
//		RandomStringGenerator random1 = new RandomStringGenerator();
//		String string1 = random1.getRandomString();
//		RandomStringGenerator random2 = new RandomStringGenerator();
//		String string2 = random2.getRandomString();
//		RandomStringGenerator random3 = new RandomStringGenerator();
//		String string3 = random3.getRandomString();
		
		String line;
	    line = "start";
		while (line.length() != 0) {
		    if (line == null || line.length() == 0) {
		    	System.out.println("Avsluttet!");
		        break;
		    } else if (line.equals("legg til")) {
		    	System.out.println("Skriv hva du vil legge til: ");
		    	line = scanner.nextLine();
		    	stringstack.push(line);
		    	System.out.println(stringstack);
		    } else if (line.equals("mål størrelse")) {
		    	System.out.println(stringstack.getSize());
		    } else if (line.equals("kikk")) { //hvorfor stopper programmet her?
		    	System.out.println("Hvilket element vil du kikke på (hvor 1 er det øverste)");
		    	int peekIndex = scanner.nextInt();
		    	System.out.println(stringstack.peek(peekIndex -1));
		    } else if (line.equals("pop")) {
		    	System.out.println(stringstack.pop() + " ble tatt vekk");
		    	System.out.println(stringstack);
		    }
		    System.out.println("Handlinger: legg til, mål størrelse, kikk, pop. Trykk enter for å avslutte. ");
		    line = scanner.nextLine();
		}
		
	}

}
