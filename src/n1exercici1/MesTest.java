package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MesTest {

	

	@Test
	void testComprobarSize() {
		int size = Mes.getMeses().size();
		int esperado = 12;
		assertEquals(size, esperado);
	}
	
	@Test
	void testComprobarAgosto() {
		if (Mes.getMeses().get(7).equalsIgnoreCase("Agosto") ) {
			System.out.println("La posición 7 corresponde a Agosto");
		} else {
			System.out.println("La posición 7 NO corresponde a Agosto");
		}
	}

}
