package upAndDownCounter_encapsulated;

//Hvordan skal private og public brukes for at denne klassen skal være korrekt innkapslet?
//SVAR: private for end og counter, public for metodene.
//Hva slags validering bør legges til for å sikre gyldig tilstand?
//SVAR: ingen?
//Hvilke metoder må evt. legges til?
//SVAR: Ingen?
//Vil du karakterisere denne klassen som data-orientert eller tjeneste-orientert. Begrunn svaret!
//SVAR: Dataorientert siden oppgaven er å inneholde variabler, å endre tilstand og å fortelle andre 
//klasser om tilstanden

public class UpOrDownCounter {
	
	private int end = 0;
	private int counter = 0;
	
	public UpOrDownCounter(int start, int end) {
		if (start == end) {
			throw new IllegalArgumentException("Verdiene var like, kan ikke flytte counter");
		}
		this.counter = start;
		this.end = end;
	}
	
	public int getCounter(){
		return counter;
	}
	
	public boolean count() {
		if (counter < end) {
			counter += 1;
			if (counter == end) {
				return false;
			}
			return true;
		} else if (counter > end) {
			counter -= 1;
			if (counter == end) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
