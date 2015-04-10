package constrainedLocation;

public class ConstrainedLocationProgram {
	
	public static void main(String[] args) {
		ConstrainedLocation location = new ConstrainedLocation(0, 0, -2, 0, 10, 10);
		location.up();
		location.left();
		location.left();
		System.out.println(location);

	}

}
