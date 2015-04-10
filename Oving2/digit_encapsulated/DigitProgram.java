package digit_encapsulated;

public class DigitProgram {
	
	
	public static void main(String[] args) {
		Digit digit1 = new Digit(16);
		Digit digit2 = new Digit(16);
		Digit digit3 = new Digit(16);
		double biggestSiffer = ((digit1.getBase() - 1) * Math.pow(digit1.getBase(), 2)) + ((digit1.getBase() - 1) * Math.pow(digit1.getBase(), 1)) + ((digit1.getBase() - 1) *Math.pow(digit1.getBase(), 0));
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
}
