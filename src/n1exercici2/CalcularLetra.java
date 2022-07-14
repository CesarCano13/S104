package n1exercici2;

public class CalcularLetra {

	private int numDni;

	public static char calcular(int numDni) {
		char[] dniLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		char letra;
		int numDniFin = 0;

		numDniFin = numDni % 23;

		return letra = dniLetra[numDniFin];

	}

}
