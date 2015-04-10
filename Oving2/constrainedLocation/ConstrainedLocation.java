package constrainedLocation;

//Hvordan skal private og public brukes for at denne klassen skal være korrekt innkapslet?
//SVAR: Private for alle variablene, x, y, og maxX, maxY, minY, minX
//Hva slags validering bør legges til for å sikre gyldig tilstand?
//SVAR: Hindre at koordinatene x og y blir større eller mindre enn grensene.
//Hvilke metoder må evt. legges til?
//SVAR: validMove
//Vil du karakterisere denne klassen som data-orientert eller tjeneste-orientert. Begrunn svaret!
//SVAR: 

public class ConstrainedLocation {
	
	
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}
	
	private int x = 0;
	private int y = 0;
	private int minX = -Integer.MAX_VALUE;
	private int minY = -Integer.MAX_VALUE;
	private int maxX = Integer.MAX_VALUE;
	private int maxY = Integer.MAX_VALUE;
	
	/*private*/ boolean isValidCoordinates(int x, int y) {
		return ((x >= minX) && (y >= minY) && (x <= maxX) && (y <= maxY));
	}
	
	public void up() {
		if (isValidCoordinates(this.x, this.y - 1)) {
			this.y = y - 1;
		}
	}
	
	public void down() {
		if (isValidCoordinates(this.x, this.y + 1)) {
			this.y = y + 1;
		}
	}
	
	public void right() {
		if (isValidCoordinates(this.x + 1, this.y)) {
			this.x = x + 1;
		}
	}
	
	public void left() {
		if (isValidCoordinates(this.x - 1, y)) {
			this.x = x - 1;	
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	ConstrainedLocation(int x, int y, int x_min, int y_min, int x_max, int y_max) {
		this.x = x;
		this.y = y;
		this.minX = x_min;
		this.minY = y_min;
		this.maxX = x_max;
		this.maxY = y_max;
	}
	
	ConstrainedLocation() {
		
	}
}
