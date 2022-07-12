package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MesTest {

	ArrayList<String> meses = new ArrayList<String>();

	//Para inicializar la clase del Array y guardarlo en una variable
	@BeforeEach
	void inicializar() {
		meses = Mes.crearArray();
	}

	// Comprobamos que el tamaño es 12
	@Test
	void testTamano() {
		assertEquals(12, meses.size());
	}

	// Comprobamos que el Array no es null
	@Test
	void testNul() {
		assertTrue(meses != null);
	}

	// Comprobamos que en la posición 7 está agosto
	@Test
	void testPosicion() {
		assertEquals("Agosto", meses.get(7));
	}

}
