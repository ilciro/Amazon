package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ControllerCatalogoHomePage;

class TestController {
	private ControllerCatalogoHomePage cHP;

	@Test
	void testStampa() {
		
		String s="borraccia";
		cHP.stampa(s);
		assertNotNull(s);
	}

}
