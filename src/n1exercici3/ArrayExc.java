package n1exercici3;

import java.util.ArrayList;

public class ArrayExc {

	public static ArrayList<String> arrayExc() throws ArrayIndexOutOfBoundsException {
		ArrayList<String> productos = new ArrayList<String>();
		productos.add("Colacao");
		productos.add("Pescaito");
		productos.add("Abichuelas");

		if (productos.size() == 0) {
			throw new ArrayIndexOutOfBoundsException("Para hacer una venta primero tienes que añadir artículos");
		}
		return productos;
	}
}
