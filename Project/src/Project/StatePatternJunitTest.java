package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatePatternJunitTest {

	@Test
	public void test() {
		CurtainContext curtain = new CurtainContext();
		curtain.PrintStatus();

		curtain.OpenCurtain();
		assertEquals(curtain.getStatus(), "Opened");
		
		curtain.CloseCurtain();
		assertEquals(curtain.getStatus(), "Closed");

		curtain.CloseCurtain();
		assertEquals(curtain.getStatus(), "Closed");
		
		curtain.OpenCurtain();
		assertEquals(curtain.getStatus(), "Opened");
		
	}

}
