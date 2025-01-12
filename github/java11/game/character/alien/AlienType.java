package github.java11.game.character.alien;
//Team Alien character
public enum AlienType {
	COMMANDER(1),
	ENFORCER(2),
	CYBERMECH(3),
	TECHNOMANCER(4),
	COSMOMYSTIC(5);

    private final int value;

    private AlienType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public String getDescription() {
        switch (this) {
            case COMMANDER:
                return "COMMANDER: Strategic and supreme leader of the aliens.";
            case ENFORCER:
                return "ENFORCER: Dedicated and relentless warrior, responsible for enforcing the law.";
            case CYBERMECH:
                return "CYBERMECH: Technologically advanced robotic entity.";
            case TECHNOMANCER:
                return "TECHNOMANCER: Technology mage, combining magic and engineering.";
            case COSMOMYSTIC:
                return "COSMOMYSTIC: Mystical healers of the cosmos.";
            default:
                return "Unknown type.";
        }
    }

}
