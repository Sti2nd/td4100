package digit_encapsulated;

// Hvordan skal private og public brukes for at denne klassen skal være korrekt innkapslet?
// SVAR: public for alle metoder, private for tallsystem og siffer/counter.
// Hva slags validering bør legges til for å sikre gyldig tilstand?
// SVAR: Validering så tallsystemet ikke kan være negativt.
// Hvilke metoder må evt. legges til?
//SVAR: Get tallsystem og set tallsystem.
// Vil du karakterisere denne klassen som data-orientert eller tjeneste-orientert. Begrunn svaret!
//SVAR: Dataorientert siden meningen med klassen er å oppbevare to variabler, øke den ene variabelen 
// og fortelle i hvilken tilstand objektet er i.

public class Digit {
	
	private int tallsystem;
	private int siffer = 0;
	
	public int getValue() {
		return siffer;
	}
	
	public int getBase() {
		return tallsystem;
	}
	
	private void setTallsystem(int tallsystem) {
		if (tallsystem > 0) {
			this.tallsystem = tallsystem;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public boolean increment() {
		if (siffer + 1 == tallsystem) {
			siffer = 0;
			return true;
		} else {
			siffer = siffer + 1;
			return false;
		}
	}
	
	
	private String numbersAndAlphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	@Override
	public String toString() {
		return String.valueOf(numbersAndAlphabet.charAt(siffer));
	}

	public Digit(int tallsystem) {
		setTallsystem(tallsystem);
	}
}
