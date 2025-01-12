package github.java11.game.character;
//class that determines the type of character
public enum CharType {
	HUMAN(1), ALIEN(2), MONSTER(3);

	private final int value;

	private CharType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		switch (this) {
		case HUMAN:
			return "HUMAN: Known for their resilience and ability to adapt to various situations. They are resourceful, working together to overcome adversity and find innovative solutions. In the game context, humans use their cooperation and inventiveness to survive and thrive.";
		case MONSTER:
			return "MONSTER: Fierce and primordial creatures that rely on their brute strength and natural instincts. They are highly territorial and vigorously protect their domain. In the game context, monsters use their ferocity and primal instincts to dominate and defend their territories.";
		case ALIEN:
			return "ALIEN: Advanced beings, both technologically and intellectually. They are strategic in their actions and possess an air of mystery. In the game, aliens use their superior technology and strategic abilities to achieve their goals, often keeping their intentions hidden.";
		default:
			return "Unknown type.";
		}
	}

}
