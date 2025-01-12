package github.java11.game;

import java.time.LocalDate;

import github.java11.game.user.People;

public class Main {

	public static void main(String[] args) {
		People obj = new People("Ronaldo", "Brazil", LocalDate.of(1990,10,20));
		System.out.println(obj);

	}

}
