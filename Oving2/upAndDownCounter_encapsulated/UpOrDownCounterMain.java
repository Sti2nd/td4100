package upAndDownCounter_encapsulated;

public class UpOrDownCounterMain {
	
	public static void main(String[] args) {
		UpOrDownCounter upOrDownCounter1 = new UpOrDownCounter(1, 3);
		System.out.println(upOrDownCounter1.getCounter());
		System.out.println(upOrDownCounter1.count());
		System.out.println(upOrDownCounter1.getCounter());
		System.out.println(upOrDownCounter1.count());
		System.out.println(upOrDownCounter1.getCounter());
		System.out.println(upOrDownCounter1.count());
	}
}
