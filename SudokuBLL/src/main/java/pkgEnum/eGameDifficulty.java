package pkgEnum;

public enum eGameDifficulty implements java.io.Serializable,java.lang.Comparable<eGameDifficulty> {
EASY, MEDIUM, HARD;

private int iDifficulty;

private static final java.util.Map<java.lang.Integer,eGameDifficulty> lookup;



public static eGameDifficulty get(int iDifficulty) {
	//return the difficulty associated with the parameter.
}

public int	getiDifficulty() {
	return iDifficulty;
}
static eGameDifficulty valueOf(java.lang.String name) {}

public static eGameDifficulty[] values() {
	
	eGameDifficulty[] diffConstants;
	
	for (eGameDifficulty c : eGameDifficulty.values()) {
		//figure out how to add the enum constants to a regular array.
	}
	    
		
}

}

