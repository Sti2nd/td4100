package stringstack;

import java.util.Random;

public class RandomStringGenerator {
	
	private String letterList = "abucdefghijklmniopqrstuvewxyza";

	public String getRandomString() {
		Random randomGenerator = new Random();
		int low = 2;
		int high = 11;
		int n = randomGenerator.nextInt(high-low) + low;
		String randomString = "";
		for (int i = 0; i < n; i++) {
			int m = randomGenerator.nextInt(letterList.length()-1);
			randomString += letterList.charAt(m);
		}
		return randomString;
	}
}
