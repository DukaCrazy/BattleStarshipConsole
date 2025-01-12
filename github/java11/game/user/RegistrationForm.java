package github.java11.game.user;

import java.util.HashSet;
import java.util.Scanner;


/**This class represents a registration form for game users. 
 * Allows you to register nicknames and, optionally, emails. 
 */
public class RegistrationForm {
	private static Scanner sc = new Scanner(System.in);
	private static HashSet<String> nicknameList = new HashSet<>();
	private static HashSet<String> emailList = new HashSet<>();

	private String nickname;
	private String password;
	private String email;
	/**In this program there is no prior need for registration with email. 
	*In principle, the only way to identify the user is through the nickname.
	*/
	public RegistrationForm() {
		while (true) {
			System.out.println("Enter the nickname");
			String nick = sc.nextLine();
			if (!nicknameList.contains(nick)) {
				this.nickname = nick;
				password();
				nicknameList.add(nick);
				break;
			} else {
				System.out.println("nickname not available");
			}
		}
	}
	/**
	 * This method is called by the constructor method. 
	 * It has the purpose of registering and confirming the password.
	 */
	private void password() {
		while (true) {
			System.out.println("Enter the password");
			var pass = sc.nextLine();
			System.out.println("Confirm password");
			var confirm = sc.nextLine();

			if (pass.equals(confirm)) {
				this.password = pass;
				break;
			} else
				System.out.println("Invalid password confirmation");
		}
	}
	/**Adding the email is voluntary. 
	 * Registering the email increases the security of your account.
	 * @param Register email
	 */
	public void addEmail(String email) {
		while (true) {
			if (!emailList.contains(email)) {
				this.email = email;
				emailList.add(email);
				break;
			} else {
				System.out.println("e-mail already registered");
			}
		}
	}

}
