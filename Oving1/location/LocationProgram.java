package location;

public class LocationProgram {
	
	public static void main(String[] args) {
		Location location = new Location();
		location.up();
		location.left();
		location.left();
		location.right();
		location.down();
		System.out.println(location);

	}

}
