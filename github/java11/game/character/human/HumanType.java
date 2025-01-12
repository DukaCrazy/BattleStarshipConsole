package github.java11.game.character.human;
//Team Human character
public enum HumanType {
	GENERAL(1), SOLDIER(2), BUILDER(3), SCIENTIST(4), MEDIC(5);

	private final int value;

	private HumanType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
	    switch (this) {
	        case GENERAL:
	            return "GENERAL: Supreme and strategic leader of humans.";
	        case SOLDIER:
	            return "SOLDIER: Dedicated and disciplined combatant, responsible for combat missions.";
	        case BUILDER:
	            return "BUILDER: Specialized builder, in charge of construction and maintenance.";
	        case SCIENTIST:
	            return "SCIENTIST: Specialist in scientific research and development.";
	        case MEDIC:
	            return "MEDIC: Healthcare professional, responsible for treating the wounded and sick.";
	        default:
	            return "Unknown type.";
	    }
	}

}
