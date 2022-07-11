package n1exercici1;

import java.util.ArrayList;

public class Mes {

	private String nom;
	private static ArrayList<String> meses = new ArrayList<String>();

	public Mes(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static ArrayList<String> getMeses() {
		return meses;
	}

	public static void setMeses(ArrayList<String> meses) {
		Mes.meses = meses;
	}

	// Metodos
	public static void anadir() {

		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");

	}

	public static void comprobarAgosto() {
		if (meses.get(7) == "Agosto") {
			System.out.println("La posición 7 corresponde a Agosto");
		} else {
			System.out.println("La posición 7 NO corresponde a Agosto");
		}
	}

	public static void comprobarSize() {
		
		
		if (meses.size() == 12) {
			System.out.println("El array tiene un tamaño de 12");
		}
		
	}

}
