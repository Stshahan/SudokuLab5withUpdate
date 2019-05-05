package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty implements java.io.Serializable,java.lang.Comparable<eGameDifficulty> {
EASY(10), MEDIUM(30), HARD(60);

private int iDifficulty;

private static final Map<Integer,eGameDifficulty> lookup = new HashMap<Integer,eGameDifficulty>();

static {
	for (eGameDifficulty c : eGameDifficulty.values()) {
		lookup.put(c.getiDifficulty(), c);
	}
}

private  eGameDifficulty (int iDifficulty) {
	this.iDifficulty=iDifficulty;
}

public int	getiDifficulty() {
	return iDifficulty;
}


public static eGameDifficulty[] values() {
	
	eGameDifficulty[] diffConstants;
	
	for (eGameDifficulty c : eGameDifficulty.values()) {
		//figure out how to add the enum constants to a regular array.
	}
	    
		
}

}

