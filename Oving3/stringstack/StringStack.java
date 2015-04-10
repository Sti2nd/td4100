package stringstack;

import java.util.ArrayList;


public class StringStack {
	
	private ArrayList<String> stringList = new ArrayList<String>();
	
	@Override
	public String toString() {
		return "Stringstack=" + stringList;
	}

	public void push(String text) {
		stringList.add(text);
	}
	
	public int getSize() {
		return stringList.size();
	}
	
	public String peek(int number) {
		if (number >= 0 && number < getSize()) {
			return stringList.get(getSize()-1-number);
		}
		return null;
	}
	
	public String pop() {
		if (getSize() != 0) {
			String element = peek(0);
			stringList.remove(getSize()-1);
			return element;	
		}
		return null;
	}
}
