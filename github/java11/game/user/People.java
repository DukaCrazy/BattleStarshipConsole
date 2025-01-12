package github.java11.game.user;

import java.time.LocalDate;
import java.time.Period;

public class People {
	private String name;
	private int age;
	private String country;
	private LocalDate birth;
	
	public People(String name,  String country, LocalDate birth) {
		this.name = name;
		this.birth = birth;
		this.country = country;
		
		setAge(birth);
		System.out.println("Successfully registered");
	}
	
	private void setAge(LocalDate birth) {
		this.age = Period.between(birth, LocalDate.now()).getYears() ;
	}
	
	//in desenvolviment
	@Override
	public String toString() {
		return "People [name=" + name + ",  age=" + age + ", country=" + country + ", birth="
				+ birth + "]";
	}
	
	
}

