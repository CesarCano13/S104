package n1exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Mes.getMeses().add("Enero");
		Mes.getMeses().add("Febrero");
		Mes.getMeses().add("Marzo");
		Mes.getMeses().add("Abril");
		Mes.getMeses().add("Mayo");
		Mes.getMeses().add("Junio");
		Mes.getMeses().add("Julio");
		Mes.getMeses().add("Agosto");
		Mes.getMeses().add("Septiembre");
		Mes.getMeses().add("Octubre");
		Mes.getMeses().add("Noviembre");
		Mes.getMeses().add("Diciembre");
		
		

		System.out.println(Mes.getMeses());
		
		Mes.comprobarAgosto();
		Mes.comprobarSize();

	}

}
