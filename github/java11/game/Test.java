package github.java11.game;
import github.java11.game.user.*;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		People obj = new People("Yuji", "Japan", LocalDate.now());
		System.out.println(obj);
		
		RegistrationForm ob = new RegistrationForm();
		RegistrationForm ob2 = new RegistrationForm();
	}

}
