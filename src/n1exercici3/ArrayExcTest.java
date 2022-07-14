package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayExcTest {
	ArrayList<String> productos = new ArrayList<String>();

	@BeforeEach
	void inicializar() {
		productos = ArrayExc.arrayExc();
	}

	@Test
	void test() {
		assertTrue(productos != null);
	}
}
