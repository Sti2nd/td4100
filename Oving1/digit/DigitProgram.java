package digit;

public class DigitProgram {
	
	
	public static void main(String[] args) {
		Digit digit1 = new Digit(16);
		Digit digit2 = new Digit(16);
		Digit digit3 = new Digit(16);
		double biggestSiffer = ((digit1.tallsystem - 1) * Math.pow(digit1.tallsystem, 2)) + ((digit1.tallsystem - 1) * Math.pow(digit1.tallsystem, 1)) + ((digit1.tallsystem - 1) *Math.pow(digit1.tallsystem, 0));
		for (int i = 0; i < biggestSiffer; i += 1) {
			if (digit1.increment()) {
				if (digit2.increment()) {
					digit3.increment();
				}
			}
		}
		System.out.print(digit3);
		System.out.print(digit2);
		System.out.println(digit1);
		
		if (digit1.increment()) {
			if (digit2.increment()) {
				digit3.increment();
			}
		}
		System.out.print(digit3);
		System.out.print(digit2);
		System.out.print(digit1);

	}
		
		
		/*
		int i = 0;
		while (!(i == 11)) {
			digit1.increment();
			i += 1;
		}
		
		System.out.println(digit1);
		*/
	}
