package n2exercici2;

import java.util.*;

public class App {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Ivan", "Garcia", 15);

		Persona persona2 = new Persona("Luis", "Fernandez", 85);

		GenericsMethods<Object> persona = new GenericsMethods<Object>();
		ArrayList<Object> arrayGeneric = new ArrayList<Object>(Arrays.asList(persona2,"Ivan", 45, persona1)); 


		persona.genericsMethods(arrayGeneric);

	}

}