package github.java11.game.character.monster;
//Team Monster character
public enum MonsterType {
    QUEEN(1),
    WARRIOR(2),
    CONSTRUCTOR(3),
    SORCERER(4),
    HEALER(5);
	
	

    private final int value;

    private MonsterType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public String getDescription() {
        switch (this) {
            case QUEEN:
                return "QUEEN: Supreme and powerful ruler among monsters.";
            case WARRIOR:
                return "WARRIOR: Fierce and combative warrior, specialized in melee battles.";
            case CONSTRUCTOR:
                return "CONSTRUCTOR: Specialist in construction and monstrous engineering.";
            case SORCERER:
                return "SORCERER: User of dark magic and arcane abilities.";
            case HEALER:
                return "HEALER: Healing monster, responsible for restoring the health of allies.";
            default:
                return "Unknown type.";
        }
    }

}
