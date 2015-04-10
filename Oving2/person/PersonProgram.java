package person;

import java.util.Date;

public class PersonProgram {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Stian Joergensrud");
		System.out.println(person1.getName());
		person1.setEmail("stian.joergensrud@gmail.no");
		System.out.println(person1.getEmail());
		Date birthday = new Date(95, 8, 3);
		person1.setBirthday(birthday);
		System.out.println(person1.getBirthday());
		person1.setGender('M');
		System.out.println(person1.getGender());
		
	}

}
