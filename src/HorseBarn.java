import java.util.ArrayList;

public class HorseBarn {
	static Horse[] spaces = {new Horse("Trigger",1340), null, new Horse("Silver", 1210)
			,new Horse("Lady",1575), null, new Horse("Patches", 1350) , new Horse("Duke",141)};
	static Horse[] getSpaces() {
	
		return spaces;
	}
	 static HorseBarn createTestBarn(){
		HorseBarn i = new HorseBarn();
		return i;
	}
	
	int findHorseSpace(String string){
		for (int i = 0; i < spaces.length; i++) {
			if(spaces[i] != null){
			if (spaces[i].getName().equals(string)) {
				return i;
			}
			}
		}
		return -1;
	}
	public static void consolidate() {
		ArrayList<Integer> fspace = new ArrayList<Integer>();
		for (int i = 0; i < spaces.length; i++) {
			if(spaces[i]==null){
				fspace.add(i);
			} else if (spaces[i] != null&&fspace.size() > 0){
				spaces[fspace.get(0)] = spaces[1];
				spaces[i] = null;
				fspace.remove(0);
				fspace.add(i);
			}
		}
		
	}
	
}
