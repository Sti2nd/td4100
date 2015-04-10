package location;

public class Location {
	
	
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}
	
	int x = 0;
	int y = 0;
	
	
	void up() {
		y = y - 1;
	}
	
	void down() {
		y = y + 1;
	}
	
	void right() {
		x = x + 1;
	}
	
	void left() {
		x = x - 1;
	}
	
	Location() {
		
	}
	
}
