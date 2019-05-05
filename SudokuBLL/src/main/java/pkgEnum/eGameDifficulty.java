package pkgEnum;

public enum eGameDifficulty implements java.io.Serializable,java.lang.Comparable<eGameDifficulty> {
EASY, MEDIUM, HARD;

private int iDifficulty;

private static final java.util.Map<java.lang.Integer,eGameDifficulty> lookup;



//static eGameDifficulty get(int iDifficulty) {}

//int	getiDifficulty() {}

//static eGameDifficulty valueOf(java.lang.String name) {}

public static eGameDifficulty[] values() {
	
	eGameDifficulty[] diffConstants;
	
	for (eGameDifficulty c : eGameDifficulty.values()) {
		//figure out how to add the enum constants to a regular array.
	}
	    
		
}

}

