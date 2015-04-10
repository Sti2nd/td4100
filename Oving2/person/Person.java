package person;

import java.util.Date;
import java.util.Locale;

public class Person {
	
	private String name;
	private String email;
	private Date birthday;
	private char gender;
	
	public void setName(String name) {
		String[] nameList = name.split(" ");
		//System.out.println(nameList[0].toString());
		//System.out.println(nameList[1].toString());
		if (nameList.length != 2) {
			throw new IllegalArgumentException();
		}
		if (nameList[0].length() < 2 || nameList[1].length() < 2) {
			throw new IllegalArgumentException();
		} 
		
		if (!nameList[0].matches("[A-Za-z]+") || !nameList[1].matches("[A-Za-z]+")  ) {
			throw new IllegalArgumentException();
		}
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
			String[] nameList = name.split(" ");
			int firstNameLength = nameList[0].length();
			int lastNameLength = nameList[1].length();
			String firstNameEmail = email.substring(0, firstNameLength);
			String lastNameEmail = email.substring(firstNameLength + 1, firstNameLength + lastNameLength + 1);
			
			if (!firstNameEmail.equals(nameList[0].toLowerCase()) || !(lastNameEmail.equals( nameList[1].toLowerCase())) ) {
				System.out.println(firstNameEmail);
				System.out.println(lastNameEmail);
				throw new IllegalStateException();
			}
			if (!Character.toString(email.charAt(lastNameLength + firstNameLength + 1)).equals("@")) {
				throw new IllegalArgumentException();
			}
			
			//check country code
			boolean value = false;
			for (final String code : Locale.getISOCountries()) {
				//System.out.println(code);
				if (email.substring(email.length() - 2, email.length()).toUpperCase().equals(code)) {
					value = true;
				} else {
					continue;
				}
			}
			
			//Check for dot after @
			if (!((email.substring((email.length() - 3), email.length() - 2))).equals(".") ) {
				value = false;
			}
			
			if (!value) {
				throw new IllegalArgumentException();
			}
			this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	

	public void setBirthday(Date birthTime) {
			Date today = new Date();
			if (birthTime.after(today)) {
				throw new IllegalArgumentException();
		} 
		this.birthday = birthTime;
	} 

	public Date getBirthday() {
		return birthday;
	}
	
	public void setGender(char gender) {
			if ((gender == 'M') || (gender == 'F') || (gender == '\0')) {
				this.gender = gender;
			} else {
				throw new IllegalArgumentException();
			}
	}
	
	public char getGender() {
		return gender;
	}
	
	
	public Person() {
		
	}

}
