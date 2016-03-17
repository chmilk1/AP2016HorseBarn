// Copyright Wintriss Technical Schools 2013



import static org.junit.Assert.*;

import org.junit.Test;

public class Horses2012 {
	Horse[] testSpaces = {new Horse("Trigger",1340), null, new Horse("Silver", 1210)
			,new Horse("Lady",1575), null, new Horse("Patches", 1350) , new Horse("Duke",141)};
	// 1. read question #3 here: http://apcentral.collegeboard.com/apc/public/repository/ap_frq_computerscience_12.pdf
	// 2. try to solve part (a) on paper

	// 3. make this test pass
	@Test 
	public void testHorseObject() throws Exception {
		Horse horse = new Horse("Trigger", 1340);
		assertEquals("Trigger", horse.getName());
		assertEquals(1340, horse.getWeight());
	}

	@Test
	public void testSetUpSpaces() throws Exception {
		// 4. create and initialize HorseBarn object
		// 5. initialize spaces as in AP exam page 14
		// 5.5 set the spaces array in the horseBarn object
		// 6. extract the last 3 steps into a method called "createTestBarn()"
		// 7. make the following asserts pass
		assertEquals("Trigger", HorseBarn.getSpaces()[0].getName());
		assertEquals("Silver", HorseBarn.getSpaces()[2].getName());
		assertEquals("Lady", HorseBarn.getSpaces()[3].getName());
		assertEquals("Patches", HorseBarn.getSpaces()[5].getName());
		assertEquals("Duke", HorseBarn.getSpaces()[6].getName());
	}


	@Test
	public void testPartA() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		assertEquals(0, horseBarn.findHorseSpace("Trigger"));// 0 A horse named Trigger is in space 0.
		assertEquals(2, horseBarn.findHorseSpace("Silver")); // 2 A horse named Silver is in space 2.
		assertEquals(-1, horseBarn.findHorseSpace("Coco"));// -1 A horse named Coco is not in the barn
	}
	
	// 8. try to solve part (b) on paper
	
	@Test
	public void testPartB() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		System.out.println(horseBarn.spaces);
		assertEquals(horseBarn.getSpaces()[0].getName(), testSpaces[0].getName());
		horseBarn.consolidate();
		assertEquals(horseBarn.getSpaces()[1].getName(), "Silver");
		// 10. write asserts that verify that the barn was consolidated (see page 16)
	}
	//hey
	
	

}




