package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import n1exercici1.Mes;

class CalcularLetraTest {

	@Test
	void calcular() {
		char letra = CalcularLetra.calcular(32083086);
		assertEquals('H', letra);

		char letra1 = CalcularLetra.calcular(32083085);
		assertEquals('V', letra1);

		char letra2 = CalcularLetra.calcular(50939661);
		assertEquals('C', letra2);

		char letra3 = CalcularLetra.calcular(84530869);
		assertEquals('G', letra3);

		char letra4 = CalcularLetra.calcular(22329420);
		assertEquals('P', letra4);

		char letra5 = CalcularLetra.calcular(35551120);
		assertEquals('C', letra5);

		char letra6 = CalcularLetra.calcular(92158670);
		assertEquals('Q', letra6);

		char letra7 = CalcularLetra.calcular(99502334);
		assertEquals('X', letra7);

		char letra8 = CalcularLetra.calcular(60651988);
		assertEquals('E', letra8);

		char letra9 = CalcularLetra.calcular(15062075);
		assertEquals('L', letra9);

	}

}
