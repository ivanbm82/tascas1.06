package n2exercici1;

public class App {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Ivan", "Garcia", 15);

		Persona persona2 = new Persona("Luis", "Fernandez", 85);

		GenericsMethods<Object> persona = new GenericsMethods<Object>();

		persona.genericsMethods(persona1, persona2.getApellido(), 25);

	}

}